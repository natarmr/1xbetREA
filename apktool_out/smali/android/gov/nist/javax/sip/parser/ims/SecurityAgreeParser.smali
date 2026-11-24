.class public Landroid/gov/nist/javax/sip/parser/ims/SecurityAgreeParser;
.super Landroid/gov/nist/javax/sip/parser/HeaderParser;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/gov/nist/javax/sip/parser/Lexer;)V
    .locals 0

    .line 5
    invoke-direct {p0, p1}, Landroid/gov/nist/javax/sip/parser/HeaderParser;-><init>(Landroid/gov/nist/javax/sip/parser/Lexer;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroid/gov/nist/javax/sip/parser/HeaderParser;-><init>(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public parse(Landroid/gov/nist/javax/sip/header/ims/SecurityAgree;)Landroid/gov/nist/javax/sip/header/SIPHeaderList;
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Landroid/gov/nist/javax/sip/header/ims/SecurityClient;

    .line 6
    .line 7
    invoke-direct {v1}, Landroid/gov/nist/javax/sip/header/ims/SecurityClient;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    new-instance v0, Landroid/gov/nist/javax/sip/header/ims/SecurityClientList;

    .line 17
    .line 18
    invoke-direct {v0}, Landroid/gov/nist/javax/sip/header/ims/SecurityClientList;-><init>()V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    new-instance v1, Landroid/gov/nist/javax/sip/header/ims/SecurityServer;

    .line 27
    .line 28
    invoke-direct {v1}, Landroid/gov/nist/javax/sip/header/ims/SecurityServer;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    new-instance v0, Landroid/gov/nist/javax/sip/header/ims/SecurityServerList;

    .line 38
    .line 39
    invoke-direct {v0}, Landroid/gov/nist/javax/sip/header/ims/SecurityServerList;-><init>()V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    new-instance v1, Landroid/gov/nist/javax/sip/header/ims/SecurityVerify;

    .line 48
    .line 49
    invoke-direct {v1}, Landroid/gov/nist/javax/sip/header/ims/SecurityVerify;-><init>()V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_b

    .line 57
    .line 58
    new-instance v0, Landroid/gov/nist/javax/sip/header/ims/SecurityVerifyList;

    .line 59
    .line 60
    invoke-direct {v0}, Landroid/gov/nist/javax/sip/header/ims/SecurityVerifyList;-><init>()V

    .line 61
    .line 62
    .line 63
    :goto_0
    iget-object v1, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 64
    .line 65
    invoke-virtual {v1}, Landroid/gov/nist/core/LexerCore;->SPorHT()V

    .line 66
    .line 67
    .line 68
    iget-object v1, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 69
    .line 70
    const/16 v2, 0xfff

    .line 71
    .line 72
    invoke-virtual {v1, v2}, Landroid/gov/nist/core/LexerCore;->match(I)Landroid/gov/nist/core/Token;

    .line 73
    .line 74
    .line 75
    iget-object v1, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 76
    .line 77
    invoke-virtual {v1}, Landroid/gov/nist/core/LexerCore;->getNextToken()Landroid/gov/nist/core/Token;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-virtual {v1}, Landroid/gov/nist/core/Token;->getTokenValue()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-virtual {p1, v1}, Landroid/gov/nist/javax/sip/header/ims/SecurityAgree;->setSecurityMechanism(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    iget-object v1, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 89
    .line 90
    invoke-virtual {v1}, Landroid/gov/nist/core/LexerCore;->SPorHT()V

    .line 91
    .line 92
    .line 93
    iget-object v1, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 94
    .line 95
    const/4 v3, 0x0

    .line 96
    invoke-virtual {v1, v3}, Landroid/gov/nist/core/StringTokenizer;->lookAhead(I)C

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    const/16 v4, 0xa

    .line 101
    .line 102
    if-ne v1, v4, :cond_2

    .line 103
    .line 104
    invoke-virtual {v0, p1}, Landroid/gov/nist/javax/sip/header/SIPHeaderList;->add(Landroid/gov/nist/javax/sip/header/SIPHeader;)Z

    .line 105
    .line 106
    .line 107
    return-object v0

    .line 108
    :cond_2
    const/16 v5, 0x3b

    .line 109
    .line 110
    if-ne v1, v5, :cond_3

    .line 111
    .line 112
    iget-object v1, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 113
    .line 114
    invoke-virtual {v1, v5}, Landroid/gov/nist/core/LexerCore;->match(I)Landroid/gov/nist/core/Token;

    .line 115
    .line 116
    .line 117
    :cond_3
    iget-object v1, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 118
    .line 119
    invoke-virtual {v1}, Landroid/gov/nist/core/LexerCore;->SPorHT()V

    .line 120
    .line 121
    .line 122
    :goto_1
    iget-object v1, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 123
    .line 124
    invoke-virtual {v1, v3}, Landroid/gov/nist/core/StringTokenizer;->lookAhead(I)C

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    if-eq v1, v4, :cond_a

    .line 129
    .line 130
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/parser/ims/SecurityAgreeParser;->parseParameter(Landroid/gov/nist/javax/sip/header/ims/SecurityAgree;)V

    .line 131
    .line 132
    .line 133
    iget-object v1, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 134
    .line 135
    invoke-virtual {v1}, Landroid/gov/nist/core/LexerCore;->SPorHT()V

    .line 136
    .line 137
    .line 138
    iget-object v1, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 139
    .line 140
    invoke-virtual {v1, v3}, Landroid/gov/nist/core/StringTokenizer;->lookAhead(I)C

    .line 141
    .line 142
    .line 143
    move-result v1

    .line 144
    if-eq v1, v4, :cond_a

    .line 145
    .line 146
    if-nez v1, :cond_4

    .line 147
    .line 148
    goto/16 :goto_3

    .line 149
    .line 150
    :cond_4
    const/16 v6, 0x2c

    .line 151
    .line 152
    if-ne v1, v6, :cond_8

    .line 153
    .line 154
    invoke-virtual {v0, p1}, Landroid/gov/nist/javax/sip/header/SIPHeaderList;->add(Landroid/gov/nist/javax/sip/header/SIPHeader;)Z

    .line 155
    .line 156
    .line 157
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    new-instance v7, Landroid/gov/nist/javax/sip/header/ims/SecurityClient;

    .line 162
    .line 163
    invoke-direct {v7}, Landroid/gov/nist/javax/sip/header/ims/SecurityClient;-><init>()V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v1, v7}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result v1

    .line 170
    if-eqz v1, :cond_5

    .line 171
    .line 172
    new-instance p1, Landroid/gov/nist/javax/sip/header/ims/SecurityClient;

    .line 173
    .line 174
    invoke-direct {p1}, Landroid/gov/nist/javax/sip/header/ims/SecurityClient;-><init>()V

    .line 175
    .line 176
    .line 177
    goto :goto_2

    .line 178
    :cond_5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    new-instance v7, Landroid/gov/nist/javax/sip/header/ims/SecurityServer;

    .line 183
    .line 184
    invoke-direct {v7}, Landroid/gov/nist/javax/sip/header/ims/SecurityServer;-><init>()V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v1, v7}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result v1

    .line 191
    if-eqz v1, :cond_6

    .line 192
    .line 193
    new-instance p1, Landroid/gov/nist/javax/sip/header/ims/SecurityServer;

    .line 194
    .line 195
    invoke-direct {p1}, Landroid/gov/nist/javax/sip/header/ims/SecurityServer;-><init>()V

    .line 196
    .line 197
    .line 198
    goto :goto_2

    .line 199
    :cond_6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    new-instance v7, Landroid/gov/nist/javax/sip/header/ims/SecurityVerify;

    .line 204
    .line 205
    invoke-direct {v7}, Landroid/gov/nist/javax/sip/header/ims/SecurityVerify;-><init>()V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v1, v7}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    move-result v1

    .line 212
    if-eqz v1, :cond_7

    .line 213
    .line 214
    new-instance p1, Landroid/gov/nist/javax/sip/header/ims/SecurityVerify;

    .line 215
    .line 216
    invoke-direct {p1}, Landroid/gov/nist/javax/sip/header/ims/SecurityVerify;-><init>()V

    .line 217
    .line 218
    .line 219
    :cond_7
    :goto_2
    iget-object v1, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 220
    .line 221
    invoke-virtual {v1, v6}, Landroid/gov/nist/core/LexerCore;->match(I)Landroid/gov/nist/core/Token;

    .line 222
    .line 223
    .line 224
    iget-object v1, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 225
    .line 226
    invoke-virtual {v1}, Landroid/gov/nist/core/LexerCore;->SPorHT()V

    .line 227
    .line 228
    .line 229
    iget-object v1, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 230
    .line 231
    invoke-virtual {v1, v2}, Landroid/gov/nist/core/LexerCore;->match(I)Landroid/gov/nist/core/Token;

    .line 232
    .line 233
    .line 234
    iget-object v1, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 235
    .line 236
    invoke-virtual {v1}, Landroid/gov/nist/core/LexerCore;->getNextToken()Landroid/gov/nist/core/Token;

    .line 237
    .line 238
    .line 239
    move-result-object v1

    .line 240
    invoke-virtual {v1}, Landroid/gov/nist/core/Token;->getTokenValue()Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v1

    .line 244
    invoke-virtual {p1, v1}, Landroid/gov/nist/javax/sip/header/ims/SecurityAgree;->setSecurityMechanism(Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    :cond_8
    iget-object v1, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 248
    .line 249
    invoke-virtual {v1}, Landroid/gov/nist/core/LexerCore;->SPorHT()V

    .line 250
    .line 251
    .line 252
    iget-object v1, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 253
    .line 254
    invoke-virtual {v1, v3}, Landroid/gov/nist/core/StringTokenizer;->lookAhead(I)C

    .line 255
    .line 256
    .line 257
    move-result v1

    .line 258
    if-ne v1, v5, :cond_9

    .line 259
    .line 260
    iget-object v1, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 261
    .line 262
    invoke-virtual {v1, v5}, Landroid/gov/nist/core/LexerCore;->match(I)Landroid/gov/nist/core/Token;

    .line 263
    .line 264
    .line 265
    :cond_9
    iget-object v1, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 266
    .line 267
    invoke-virtual {v1}, Landroid/gov/nist/core/LexerCore;->SPorHT()V

    .line 268
    .line 269
    .line 270
    goto/16 :goto_1

    .line 271
    .line 272
    :cond_a
    :goto_3
    invoke-virtual {v0, p1}, Landroid/gov/nist/javax/sip/header/SIPHeaderList;->add(Landroid/gov/nist/javax/sip/header/SIPHeader;)Z

    .line 273
    .line 274
    .line 275
    return-object v0

    .line 276
    :cond_b
    const/4 p0, 0x0

    .line 277
    return-object p0
.end method

.method public parseParameter(Landroid/gov/nist/javax/sip/header/ims/SecurityAgree;)V
    .locals 3

    .line 1
    sget-boolean v0, Landroid/gov/nist/core/ParserCore;->debug:Z

    .line 2
    .line 3
    const-string v1, "parseParameter"

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
    const/16 v2, 0x3d

    .line 11
    .line 12
    :try_start_0
    invoke-virtual {p0, v2}, Landroid/gov/nist/core/ParserCore;->nameValue(C)Landroid/gov/nist/core/NameValue;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {p1, v2}, Landroid/gov/nist/javax/sip/header/ParametersHeader;->setParameter(Landroid/gov/nist/core/NameValue;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {p0, v1}, Landroid/gov/nist/core/ParserCore;->dbg_leave(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    :cond_1
    return-void

    .line 25
    :catchall_0
    move-exception p1

    .line 26
    sget-boolean v0, Landroid/gov/nist/core/ParserCore;->debug:Z

    .line 27
    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    invoke-virtual {p0, v1}, Landroid/gov/nist/core/ParserCore;->dbg_leave(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :cond_2
    throw p1
.end method
