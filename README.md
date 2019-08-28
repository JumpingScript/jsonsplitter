# jsonsplitter
Quick 'n' dirty file forger for mediawiki-query json exports

# Usage
* Run this query in PHPmyadmin:
```sql
SELECT text.old_text,
    page.page_title
FROM text
INNER JOIN revision ON text
    .old_id = revision.rev_text_id
INNER JOIN page ON revision.rev_page = page.page_id
```
* export it as json.
* let this script progress it. Paths are somwhere in the code.
