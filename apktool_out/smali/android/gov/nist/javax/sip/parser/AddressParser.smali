.class public Landroid/gov/nist/javax/sip/parser/AddressParser;
.super Landroid/gov/nist/javax/sip/parser/Parser;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/gov/nist/javax/sip/parser/Lexer;)V
    .locals 0

    .line 14
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/parser/Parser;-><init>()V

    .line 15
    iput-object p1, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 16
    const-string p0, "charLexer"

    invoke-virtual {p1, p0}, Landroid/gov/nist/core/LexerCore;->selectLexer(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/parser/Parser;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/gov/nist/javax/sip/parser/Lexer;

    .line 5
    .line 6
    const-string v1, "charLexer"

    .line 7
    .line 8
    invoke-direct {v0, v1, p1}, Landroid/gov/nist/javax/sip/parser/Lexer;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public address(Z)Landroid/gov/nist/javax/sip/address/AddressImpl;
    .locals 7

    .line 1
    sget-boolean v0, Landroid/gov/nist/core/ParserCore;->debug:Z

    .line 2
    .line 3
    const-string v1, "address"

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, v1}, Landroid/gov/nist/core/ParserCore;->dbg_enter(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    :try_start_0
    iget-object v2, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 12
    .line 13
    invoke-virtual {v2}, Landroid/gov/nist/core/StringTokenizer;->hasMoreChars()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const/16 v3, 0x2f

    .line 18
    .line 19
    const/16 v4, 0x3a

    .line 20
    .line 21
    const/16 v5, 0x22

    .line 22
    .line 23
    const/16 v6, 0x3c

    .line 24
    .line 25
    if-eqz v2, :cond_3

    .line 26
    .line 27
    iget-object v2, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 28
    .line 29
    invoke-virtual {v2, v0}, Landroid/gov/nist/core/StringTokenizer;->lookAhead(I)C

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eq v2, v6, :cond_3

    .line 34
    .line 35
    if-eq v2, v5, :cond_3

    .line 36
    .line 37
    if-eq v2, v4, :cond_3

    .line 38
    .line 39
    if-ne v2, v3, :cond_1

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    if-eqz v2, :cond_2

    .line 43
    .line 44
    add-int/lit8 v0, v0, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    const-string p1, "unexpected EOL"

    .line 48
    .line 49
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/parser/Parser;->createParseException(Ljava/lang/String;)Ljava/text/ParseException;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    throw p1

    .line 54
    :catchall_0
    move-exception p1

    .line 55
    goto :goto_5

    .line 56
    :cond_3
    :goto_1
    iget-object v2, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 57
    .line 58
    invoke-virtual {v2, v0}, Landroid/gov/nist/core/StringTokenizer;->lookAhead(I)C

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eq v0, v6, :cond_7

    .line 63
    .line 64
    if-ne v0, v5, :cond_4

    .line 65
    .line 66
    goto :goto_3

    .line 67
    :cond_4
    if-eq v0, v4, :cond_6

    .line 68
    .line 69
    if-ne v0, v3, :cond_5

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_5
    const-string p1, "Bad address spec"

    .line 73
    .line 74
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/parser/Parser;->createParseException(Ljava/lang/String;)Ljava/text/ParseException;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    throw p1

    .line 79
    :cond_6
    :goto_2
    new-instance v0, Landroid/gov/nist/javax/sip/address/AddressImpl;

    .line 80
    .line 81
    invoke-direct {v0}, Landroid/gov/nist/javax/sip/address/AddressImpl;-><init>()V

    .line 82
    .line 83
    .line 84
    new-instance v2, Landroid/gov/nist/javax/sip/parser/URLParser;

    .line 85
    .line 86
    iget-object v3, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 87
    .line 88
    check-cast v3, Landroid/gov/nist/javax/sip/parser/Lexer;

    .line 89
    .line 90
    invoke-direct {v2, v3}, Landroid/gov/nist/javax/sip/parser/URLParser;-><init>(Landroid/gov/nist/javax/sip/parser/Lexer;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v2, p1}, Landroid/gov/nist/javax/sip/parser/URLParser;->uriReference(Z)Landroid/gov/nist/javax/sip/address/GenericURI;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    const/4 v2, 0x2

    .line 98
    invoke-virtual {v0, v2}, Landroid/gov/nist/javax/sip/address/AddressImpl;->setAddressType(I)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0, p1}, Landroid/gov/nist/javax/sip/address/AddressImpl;->setURI(Landroid/javax/sip/address/URI;)V

    .line 102
    .line 103
    .line 104
    goto :goto_4

    .line 105
    :cond_7
    :goto_3
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/parser/AddressParser;->nameAddr()Landroid/gov/nist/javax/sip/address/AddressImpl;

    .line 106
    .line 107
    .line 108
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 109
    :goto_4
    sget-boolean p1, Landroid/gov/nist/core/ParserCore;->debug:Z

    .line 110
    .line 111
    if-eqz p1, :cond_8

    .line 112
    .line 113
    invoke-virtual {p0, v1}, Landroid/gov/nist/core/ParserCore;->dbg_leave(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    :cond_8
    return-object v0

    .line 117
    :goto_5
    sget-boolean v0, Landroid/gov/nist/core/ParserCore;->debug:Z

    .line 118
    .line 119
    if-eqz v0, :cond_9

    .line 120
    .line 121
    invoke-virtual {p0, v1}, Landroid/gov/nist/core/ParserCore;->dbg_leave(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    :cond_9
    throw p1
.end method

.method public nameAddr()Landroid/gov/nist/javax/sip/address/AddressImpl;
    .locals 9

    .line 1
    sget-boolean v0, Landroid/gov/nist/core/ParserCore;->debug:Z

    .line 2
    .line 3
    const-string v1, "nameAddr"

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, v1}, Landroid/gov/nist/core/ParserCore;->dbg_enter(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    :try_start_0
    iget-object v2, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    invoke-virtual {v2, v3}, Landroid/gov/nist/core/StringTokenizer;->lookAhead(I)C

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const/16 v4, 0x3e

    .line 18
    .line 19
    const/16 v5, 0x3c

    .line 20
    .line 21
    const/4 v6, 0x1

    .line 22
    if-ne v2, v5, :cond_2

    .line 23
    .line 24
    iget-object v2, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 25
    .line 26
    invoke-virtual {v2, v6}, Landroid/gov/nist/core/StringTokenizer;->consume(I)V

    .line 27
    .line 28
    .line 29
    iget-object v2, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 30
    .line 31
    const-string v3, "sip_urlLexer"

    .line 32
    .line 33
    invoke-virtual {v2, v3}, Landroid/gov/nist/core/LexerCore;->selectLexer(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    iget-object v2, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 37
    .line 38
    invoke-virtual {v2}, Landroid/gov/nist/core/LexerCore;->SPorHT()V

    .line 39
    .line 40
    .line 41
    new-instance v2, Landroid/gov/nist/javax/sip/parser/URLParser;

    .line 42
    .line 43
    iget-object v3, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 44
    .line 45
    check-cast v3, Landroid/gov/nist/javax/sip/parser/Lexer;

    .line 46
    .line 47
    invoke-direct {v2, v3}, Landroid/gov/nist/javax/sip/parser/URLParser;-><init>(Landroid/gov/nist/javax/sip/parser/Lexer;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2, v6}, Landroid/gov/nist/javax/sip/parser/URLParser;->uriReference(Z)Landroid/gov/nist/javax/sip/address/GenericURI;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    new-instance v3, Landroid/gov/nist/javax/sip/address/AddressImpl;

    .line 55
    .line 56
    invoke-direct {v3}, Landroid/gov/nist/javax/sip/address/AddressImpl;-><init>()V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v3, v6}, Landroid/gov/nist/javax/sip/address/AddressImpl;->setAddressType(I)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v3, v2}, Landroid/gov/nist/javax/sip/address/AddressImpl;->setURI(Landroid/javax/sip/address/URI;)V

    .line 63
    .line 64
    .line 65
    iget-object v2, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 66
    .line 67
    invoke-virtual {v2}, Landroid/gov/nist/core/LexerCore;->SPorHT()V

    .line 68
    .line 69
    .line 70
    iget-object v2, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 71
    .line 72
    invoke-virtual {v2, v4}, Landroid/gov/nist/core/LexerCore;->match(I)Landroid/gov/nist/core/Token;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 73
    .line 74
    .line 75
    if-eqz v0, :cond_1

    .line 76
    .line 77
    invoke-virtual {p0, v1}, Landroid/gov/nist/core/ParserCore;->dbg_leave(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    :cond_1
    return-object v3

    .line 81
    :catchall_0
    move-exception v0

    .line 82
    goto :goto_1

    .line 83
    :cond_2
    :try_start_1
    new-instance v2, Landroid/gov/nist/javax/sip/address/AddressImpl;

    .line 84
    .line 85
    invoke-direct {v2}, Landroid/gov/nist/javax/sip/address/AddressImpl;-><init>()V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2, v6}, Landroid/gov/nist/javax/sip/address/AddressImpl;->setAddressType(I)V

    .line 89
    .line 90
    .line 91
    iget-object v7, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 92
    .line 93
    invoke-virtual {v7, v3}, Landroid/gov/nist/core/StringTokenizer;->lookAhead(I)C

    .line 94
    .line 95
    .line 96
    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 97
    iget-object v7, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 98
    .line 99
    const/16 v8, 0x22

    .line 100
    .line 101
    if-ne v3, v8, :cond_3

    .line 102
    .line 103
    :try_start_2
    invoke-virtual {v7}, Landroid/gov/nist/core/LexerCore;->quotedString()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    iget-object v7, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 108
    .line 109
    invoke-virtual {v7}, Landroid/gov/nist/core/LexerCore;->SPorHT()V

    .line 110
    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_3
    invoke-virtual {v7, v5}, Landroid/gov/nist/core/StringTokenizer;->getNextToken(C)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    :goto_0
    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    invoke-virtual {v2, v3}, Landroid/gov/nist/javax/sip/address/AddressImpl;->setDisplayName(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    iget-object v3, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 125
    .line 126
    invoke-virtual {v3, v5}, Landroid/gov/nist/core/LexerCore;->match(I)Landroid/gov/nist/core/Token;

    .line 127
    .line 128
    .line 129
    iget-object v3, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 130
    .line 131
    invoke-virtual {v3}, Landroid/gov/nist/core/LexerCore;->SPorHT()V

    .line 132
    .line 133
    .line 134
    new-instance v3, Landroid/gov/nist/javax/sip/parser/URLParser;

    .line 135
    .line 136
    iget-object v5, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 137
    .line 138
    check-cast v5, Landroid/gov/nist/javax/sip/parser/Lexer;

    .line 139
    .line 140
    invoke-direct {v3, v5}, Landroid/gov/nist/javax/sip/parser/URLParser;-><init>(Landroid/gov/nist/javax/sip/parser/Lexer;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v3, v6}, Landroid/gov/nist/javax/sip/parser/URLParser;->uriReference(Z)Landroid/gov/nist/javax/sip/address/GenericURI;

    .line 144
    .line 145
    .line 146
    move-result-object v3

    .line 147
    new-instance v5, Landroid/gov/nist/javax/sip/address/AddressImpl;

    .line 148
    .line 149
    invoke-direct {v5}, Landroid/gov/nist/javax/sip/address/AddressImpl;-><init>()V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v2, v6}, Landroid/gov/nist/javax/sip/address/AddressImpl;->setAddressType(I)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v2, v3}, Landroid/gov/nist/javax/sip/address/AddressImpl;->setURI(Landroid/javax/sip/address/URI;)V

    .line 156
    .line 157
    .line 158
    iget-object v3, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 159
    .line 160
    invoke-virtual {v3}, Landroid/gov/nist/core/LexerCore;->SPorHT()V

    .line 161
    .line 162
    .line 163
    iget-object v3, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 164
    .line 165
    invoke-virtual {v3, v4}, Landroid/gov/nist/core/LexerCore;->match(I)Landroid/gov/nist/core/Token;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 166
    .line 167
    .line 168
    if-eqz v0, :cond_4

    .line 169
    .line 170
    invoke-virtual {p0, v1}, Landroid/gov/nist/core/ParserCore;->dbg_leave(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    :cond_4
    return-object v2

    .line 174
    :goto_1
    sget-boolean v2, Landroid/gov/nist/core/ParserCore;->debug:Z

    .line 175
    .line 176
    if-eqz v2, :cond_5

    .line 177
    .line 178
    invoke-virtual {p0, v1}, Landroid/gov/nist/core/ParserCore;->dbg_leave(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    :cond_5
    throw v0
.end method
