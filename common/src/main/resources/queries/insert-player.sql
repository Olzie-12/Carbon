INSERT IGNORE INTO carbon_users SET
    id = :id,
    muted = :muted,
    deafened = :deafened,
    selectedchannel = :selectedchannel,
    displayname = :displayname,
    lastwhispertarget = :lastwhispertarget,
    whisperreplytarget = :whisperreplytarget,
    spying = :spying,
    ignoringdms = :ignoringdms;
