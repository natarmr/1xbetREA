.class public Landroid/gov/nist/javax/sip/address/SipUri;
.super Landroid/gov/nist/javax/sip/address/GenericURI;
.source "SourceFile"

# interfaces
.implements Landroid/javax/sip/address/SipURI;
.implements Landroid/gov/nist/javax/sip/address/SipURIExt;


# static fields
.field private static final serialVersionUID:J = 0x6b8cc0d42713c224L


# instance fields
.field protected authority:Landroid/gov/nist/javax/sip/address/Authority;

.field protected qheaders:Landroid/gov/nist/core/NameValueList;

.field protected telephoneSubscriber:Landroid/gov/nist/javax/sip/address/TelephoneNumber;

.field protected uriParms:Landroid/gov/nist/core/NameValueList;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/address/GenericURI;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "sip"

    .line 5
    .line 6
    iput-object v0, p0, Landroid/gov/nist/javax/sip/address/GenericURI;->scheme:Ljava/lang/String;

    .line 7
    .line 8
    new-instance v0, Landroid/gov/nist/core/NameValueList;

    .line 9
    .line 10
    invoke-direct {v0}, Landroid/gov/nist/core/NameValueList;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Landroid/gov/nist/javax/sip/address/SipUri;->uriParms:Landroid/gov/nist/core/NameValueList;

    .line 14
    .line 15
    new-instance v0, Landroid/gov/nist/core/NameValueList;

    .line 16
    .line 17
    invoke-direct {v0}, Landroid/gov/nist/core/NameValueList;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Landroid/gov/nist/javax/sip/address/SipUri;->qheaders:Landroid/gov/nist/core/NameValueList;

    .line 21
    .line 22
    const-string p0, "&"

    .line 23
    .line 24
    invoke-virtual {v0, p0}, Landroid/gov/nist/core/NameValueList;->setSeparator(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public clearPassword()V
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/SipUri;->authority:Landroid/gov/nist/javax/sip/address/Authority;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/address/Authority;->getUserInfo()Landroid/gov/nist/javax/sip/address/UserInfo;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/address/UserInfo;->clearPassword()V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public clearQheaders()V
    .locals 1

    .line 1
    new-instance v0, Landroid/gov/nist/core/NameValueList;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/gov/nist/core/NameValueList;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Landroid/gov/nist/javax/sip/address/SipUri;->qheaders:Landroid/gov/nist/core/NameValueList;

    .line 7
    .line 8
    return-void
.end method

.method public clearUriParms()V
    .locals 1

    .line 1
    new-instance v0, Landroid/gov/nist/core/NameValueList;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/gov/nist/core/NameValueList;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Landroid/gov/nist/javax/sip/address/SipUri;->uriParms:Landroid/gov/nist/core/NameValueList;

    .line 7
    .line 8
    return-void
.end method

.method public clone()Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/gov/nist/core/GenericObject;->clone()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Landroid/gov/nist/javax/sip/address/SipUri;

    .line 6
    .line 7
    iget-object v1, p0, Landroid/gov/nist/javax/sip/address/SipUri;->authority:Landroid/gov/nist/javax/sip/address/Authority;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/address/Authority;->clone()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Landroid/gov/nist/javax/sip/address/Authority;

    .line 16
    .line 17
    iput-object v1, v0, Landroid/gov/nist/javax/sip/address/SipUri;->authority:Landroid/gov/nist/javax/sip/address/Authority;

    .line 18
    .line 19
    :cond_0
    iget-object v1, p0, Landroid/gov/nist/javax/sip/address/SipUri;->uriParms:Landroid/gov/nist/core/NameValueList;

    .line 20
    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    invoke-virtual {v1}, Landroid/gov/nist/core/NameValueList;->clone()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Landroid/gov/nist/core/NameValueList;

    .line 28
    .line 29
    iput-object v1, v0, Landroid/gov/nist/javax/sip/address/SipUri;->uriParms:Landroid/gov/nist/core/NameValueList;

    .line 30
    .line 31
    :cond_1
    iget-object v1, p0, Landroid/gov/nist/javax/sip/address/SipUri;->qheaders:Landroid/gov/nist/core/NameValueList;

    .line 32
    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    invoke-virtual {v1}, Landroid/gov/nist/core/NameValueList;->clone()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    check-cast v1, Landroid/gov/nist/core/NameValueList;

    .line 40
    .line 41
    iput-object v1, v0, Landroid/gov/nist/javax/sip/address/SipUri;->qheaders:Landroid/gov/nist/core/NameValueList;

    .line 42
    .line 43
    :cond_2
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/SipUri;->telephoneSubscriber:Landroid/gov/nist/javax/sip/address/TelephoneNumber;

    .line 44
    .line 45
    if-eqz p0, :cond_3

    .line 46
    .line 47
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/address/TelephoneNumber;->clone()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, Landroid/gov/nist/javax/sip/address/TelephoneNumber;

    .line 52
    .line 53
    iput-object p0, v0, Landroid/gov/nist/javax/sip/address/SipUri;->telephoneSubscriber:Landroid/gov/nist/javax/sip/address/TelephoneNumber;

    .line 54
    .line 55
    :cond_3
    return-object v0
.end method

.method public encode()Ljava/lang/String;
    .locals 1

    .line 55
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/address/SipUri;->encode(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public encode(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;
    .locals 1

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/address/GenericURI;->scheme:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    .line 5
    .line 6
    const-string v0, ":"

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Landroid/gov/nist/javax/sip/address/SipUri;->authority:Landroid/gov/nist/javax/sip/address/Authority;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Landroid/gov/nist/javax/sip/address/Authority;->encode(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    :cond_0
    iget-object v0, p0, Landroid/gov/nist/javax/sip/address/SipUri;->uriParms:Landroid/gov/nist/core/NameValueList;

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/gov/nist/core/NameValueList;->isEmpty()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    const-string v0, ";"

    .line 27
    .line 28
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Landroid/gov/nist/javax/sip/address/SipUri;->uriParms:Landroid/gov/nist/core/NameValueList;

    .line 32
    .line 33
    invoke-virtual {v0, p1}, Landroid/gov/nist/core/NameValueList;->encode(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    :cond_1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/address/SipUri;->qheaders:Landroid/gov/nist/core/NameValueList;

    .line 37
    .line 38
    invoke-virtual {v0}, Landroid/gov/nist/core/NameValueList;->isEmpty()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-nez v0, :cond_2

    .line 43
    .line 44
    const-string v0, "?"

    .line 45
    .line 46
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/SipUri;->qheaders:Landroid/gov/nist/core/NameValueList;

    .line 50
    .line 51
    invoke-virtual {p0, p1}, Landroid/gov/nist/core/NameValueList;->encode(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    :cond_2
    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p1, p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Landroid/javax/sip/address/SipURI;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_27

    .line 9
    .line 10
    check-cast p1, Landroid/javax/sip/address/SipURI;

    .line 11
    .line 12
    invoke-interface {p0}, Landroid/javax/sip/address/SipURI;->isSecure()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    invoke-interface {p1}, Landroid/javax/sip/address/SipURI;->isSecure()Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    xor-int/2addr v1, v3

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    return v2

    .line 24
    :cond_1
    invoke-interface {p0}, Landroid/javax/sip/address/SipURI;->getUser()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    if-nez v1, :cond_2

    .line 29
    .line 30
    move v1, v0

    .line 31
    goto :goto_0

    .line 32
    :cond_2
    move v1, v2

    .line 33
    :goto_0
    invoke-interface {p1}, Landroid/javax/sip/address/SipURI;->getUser()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    if-nez v3, :cond_3

    .line 38
    .line 39
    move v3, v0

    .line 40
    goto :goto_1

    .line 41
    :cond_3
    move v3, v2

    .line 42
    :goto_1
    xor-int/2addr v1, v3

    .line 43
    if-eqz v1, :cond_4

    .line 44
    .line 45
    return v2

    .line 46
    :cond_4
    invoke-interface {p0}, Landroid/javax/sip/address/SipURI;->getUserPassword()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    if-nez v1, :cond_5

    .line 51
    .line 52
    move v1, v0

    .line 53
    goto :goto_2

    .line 54
    :cond_5
    move v1, v2

    .line 55
    :goto_2
    invoke-interface {p1}, Landroid/javax/sip/address/SipURI;->getUserPassword()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    if-nez v3, :cond_6

    .line 60
    .line 61
    move v3, v0

    .line 62
    goto :goto_3

    .line 63
    :cond_6
    move v3, v2

    .line 64
    :goto_3
    xor-int/2addr v1, v3

    .line 65
    if-eqz v1, :cond_7

    .line 66
    .line 67
    return v2

    .line 68
    :cond_7
    invoke-interface {p0}, Landroid/javax/sip/address/SipURI;->getUser()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    if-eqz v1, :cond_8

    .line 73
    .line 74
    invoke-interface {p0}, Landroid/javax/sip/address/SipURI;->getUser()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-static {v1}, Landroid/gov/nist/javax/sip/address/UriDecoder;->decode(Ljava/lang/String;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-interface {p1}, Landroid/javax/sip/address/SipURI;->getUser()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    invoke-static {v3}, Landroid/gov/nist/javax/sip/address/UriDecoder;->decode(Ljava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    if-nez v1, :cond_8

    .line 95
    .line 96
    return v2

    .line 97
    :cond_8
    invoke-interface {p0}, Landroid/javax/sip/address/SipURI;->getUserPassword()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    if-eqz v1, :cond_9

    .line 102
    .line 103
    invoke-interface {p0}, Landroid/javax/sip/address/SipURI;->getUserPassword()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    invoke-static {v1}, Landroid/gov/nist/javax/sip/address/UriDecoder;->decode(Ljava/lang/String;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    invoke-interface {p1}, Landroid/javax/sip/address/SipURI;->getUserPassword()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    invoke-static {v3}, Landroid/gov/nist/javax/sip/address/UriDecoder;->decode(Ljava/lang/String;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v1

    .line 123
    if-nez v1, :cond_9

    .line 124
    .line 125
    return v2

    .line 126
    :cond_9
    invoke-interface {p0}, Landroid/javax/sip/address/SipURI;->getHost()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    if-nez v1, :cond_a

    .line 131
    .line 132
    move v1, v0

    .line 133
    goto :goto_4

    .line 134
    :cond_a
    move v1, v2

    .line 135
    :goto_4
    invoke-interface {p1}, Landroid/javax/sip/address/SipURI;->getHost()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    if-nez v3, :cond_b

    .line 140
    .line 141
    move v3, v0

    .line 142
    goto :goto_5

    .line 143
    :cond_b
    move v3, v2

    .line 144
    :goto_5
    xor-int/2addr v1, v3

    .line 145
    if-eqz v1, :cond_c

    .line 146
    .line 147
    return v2

    .line 148
    :cond_c
    invoke-interface {p0}, Landroid/javax/sip/address/SipURI;->getHost()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    if-eqz v1, :cond_d

    .line 153
    .line 154
    invoke-interface {p0}, Landroid/javax/sip/address/SipURI;->getHost()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    invoke-interface {p1}, Landroid/javax/sip/address/SipURI;->getHost()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v3

    .line 162
    invoke-virtual {v1, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 163
    .line 164
    .line 165
    move-result v1

    .line 166
    if-nez v1, :cond_d

    .line 167
    .line 168
    return v2

    .line 169
    :cond_d
    invoke-interface {p0}, Landroid/javax/sip/address/SipURI;->getPort()I

    .line 170
    .line 171
    .line 172
    move-result v1

    .line 173
    invoke-interface {p1}, Landroid/javax/sip/address/SipURI;->getPort()I

    .line 174
    .line 175
    .line 176
    move-result v3

    .line 177
    if-eq v1, v3, :cond_e

    .line 178
    .line 179
    return v2

    .line 180
    :cond_e
    invoke-interface {p0}, Landroid/javax/sip/header/Parameters;->getParameterNames()Ljava/util/Iterator;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    :cond_f
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 185
    .line 186
    .line 187
    move-result v3

    .line 188
    if-eqz v3, :cond_10

    .line 189
    .line 190
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v3

    .line 194
    check-cast v3, Ljava/lang/String;

    .line 195
    .line 196
    invoke-interface {p0, v3}, Landroid/javax/sip/header/Parameters;->getParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v4

    .line 200
    invoke-interface {p1, v3}, Landroid/javax/sip/header/Parameters;->getParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v3

    .line 204
    if-eqz v4, :cond_f

    .line 205
    .line 206
    if-eqz v3, :cond_f

    .line 207
    .line 208
    invoke-static {v4}, Landroid/gov/nist/javax/sip/address/UriDecoder;->decode(Ljava/lang/String;)Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v4

    .line 212
    invoke-static {v3}, Landroid/gov/nist/javax/sip/address/UriDecoder;->decode(Ljava/lang/String;)Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v3

    .line 216
    invoke-virtual {v4, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 217
    .line 218
    .line 219
    move-result v3

    .line 220
    if-nez v3, :cond_f

    .line 221
    .line 222
    return v2

    .line 223
    :cond_10
    invoke-interface {p0}, Landroid/javax/sip/address/SipURI;->getTransportParam()Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v1

    .line 227
    if-nez v1, :cond_11

    .line 228
    .line 229
    move v1, v0

    .line 230
    goto :goto_6

    .line 231
    :cond_11
    move v1, v2

    .line 232
    :goto_6
    invoke-interface {p1}, Landroid/javax/sip/address/SipURI;->getTransportParam()Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v3

    .line 236
    if-nez v3, :cond_12

    .line 237
    .line 238
    move v3, v0

    .line 239
    goto :goto_7

    .line 240
    :cond_12
    move v3, v2

    .line 241
    :goto_7
    xor-int/2addr v1, v3

    .line 242
    if-eqz v1, :cond_13

    .line 243
    .line 244
    return v2

    .line 245
    :cond_13
    invoke-interface {p0}, Landroid/javax/sip/address/SipURI;->getUserParam()Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v1

    .line 249
    if-nez v1, :cond_14

    .line 250
    .line 251
    move v1, v0

    .line 252
    goto :goto_8

    .line 253
    :cond_14
    move v1, v2

    .line 254
    :goto_8
    invoke-interface {p1}, Landroid/javax/sip/address/SipURI;->getUserParam()Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v3

    .line 258
    if-nez v3, :cond_15

    .line 259
    .line 260
    move v3, v0

    .line 261
    goto :goto_9

    .line 262
    :cond_15
    move v3, v2

    .line 263
    :goto_9
    xor-int/2addr v1, v3

    .line 264
    if-eqz v1, :cond_16

    .line 265
    .line 266
    return v2

    .line 267
    :cond_16
    invoke-interface {p0}, Landroid/javax/sip/address/SipURI;->getTTLParam()I

    .line 268
    .line 269
    .line 270
    move-result v1

    .line 271
    const/4 v3, -0x1

    .line 272
    if-ne v1, v3, :cond_17

    .line 273
    .line 274
    move v1, v0

    .line 275
    goto :goto_a

    .line 276
    :cond_17
    move v1, v2

    .line 277
    :goto_a
    invoke-interface {p1}, Landroid/javax/sip/address/SipURI;->getTTLParam()I

    .line 278
    .line 279
    .line 280
    move-result v4

    .line 281
    if-ne v4, v3, :cond_18

    .line 282
    .line 283
    move v3, v0

    .line 284
    goto :goto_b

    .line 285
    :cond_18
    move v3, v2

    .line 286
    :goto_b
    xor-int/2addr v1, v3

    .line 287
    if-eqz v1, :cond_19

    .line 288
    .line 289
    return v2

    .line 290
    :cond_19
    invoke-interface {p0}, Landroid/javax/sip/address/SipURI;->getMethodParam()Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object v1

    .line 294
    if-nez v1, :cond_1a

    .line 295
    .line 296
    move v1, v0

    .line 297
    goto :goto_c

    .line 298
    :cond_1a
    move v1, v2

    .line 299
    :goto_c
    invoke-interface {p1}, Landroid/javax/sip/address/SipURI;->getMethodParam()Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v3

    .line 303
    if-nez v3, :cond_1b

    .line 304
    .line 305
    move v3, v0

    .line 306
    goto :goto_d

    .line 307
    :cond_1b
    move v3, v2

    .line 308
    :goto_d
    xor-int/2addr v1, v3

    .line 309
    if-eqz v1, :cond_1c

    .line 310
    .line 311
    return v2

    .line 312
    :cond_1c
    invoke-interface {p0}, Landroid/javax/sip/address/SipURI;->getMAddrParam()Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object v1

    .line 316
    if-nez v1, :cond_1d

    .line 317
    .line 318
    move v1, v0

    .line 319
    goto :goto_e

    .line 320
    :cond_1d
    move v1, v2

    .line 321
    :goto_e
    invoke-interface {p1}, Landroid/javax/sip/address/SipURI;->getMAddrParam()Ljava/lang/String;

    .line 322
    .line 323
    .line 324
    move-result-object v3

    .line 325
    if-nez v3, :cond_1e

    .line 326
    .line 327
    move v3, v0

    .line 328
    goto :goto_f

    .line 329
    :cond_1e
    move v3, v2

    .line 330
    :goto_f
    xor-int/2addr v1, v3

    .line 331
    if-eqz v1, :cond_1f

    .line 332
    .line 333
    return v2

    .line 334
    :cond_1f
    invoke-interface {p0}, Landroid/javax/sip/address/SipURI;->getHeaderNames()Ljava/util/Iterator;

    .line 335
    .line 336
    .line 337
    move-result-object v1

    .line 338
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 339
    .line 340
    .line 341
    move-result v1

    .line 342
    if-eqz v1, :cond_20

    .line 343
    .line 344
    invoke-interface {p1}, Landroid/javax/sip/address/SipURI;->getHeaderNames()Ljava/util/Iterator;

    .line 345
    .line 346
    .line 347
    move-result-object v1

    .line 348
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 349
    .line 350
    .line 351
    move-result v1

    .line 352
    if-nez v1, :cond_20

    .line 353
    .line 354
    return v2

    .line 355
    :cond_20
    invoke-interface {p0}, Landroid/javax/sip/address/SipURI;->getHeaderNames()Ljava/util/Iterator;

    .line 356
    .line 357
    .line 358
    move-result-object v1

    .line 359
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 360
    .line 361
    .line 362
    move-result v1

    .line 363
    if-nez v1, :cond_21

    .line 364
    .line 365
    invoke-interface {p1}, Landroid/javax/sip/address/SipURI;->getHeaderNames()Ljava/util/Iterator;

    .line 366
    .line 367
    .line 368
    move-result-object v1

    .line 369
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 370
    .line 371
    .line 372
    move-result v1

    .line 373
    if-eqz v1, :cond_21

    .line 374
    .line 375
    return v2

    .line 376
    :cond_21
    invoke-interface {p0}, Landroid/javax/sip/address/SipURI;->getHeaderNames()Ljava/util/Iterator;

    .line 377
    .line 378
    .line 379
    move-result-object v1

    .line 380
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 381
    .line 382
    .line 383
    move-result v1

    .line 384
    if-eqz v1, :cond_26

    .line 385
    .line 386
    invoke-interface {p1}, Landroid/javax/sip/address/SipURI;->getHeaderNames()Ljava/util/Iterator;

    .line 387
    .line 388
    .line 389
    move-result-object v1

    .line 390
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 391
    .line 392
    .line 393
    move-result v1

    .line 394
    if-eqz v1, :cond_26

    .line 395
    .line 396
    :try_start_0
    invoke-static {}, Landroid/javax/sip/SipFactory;->getInstance()Landroid/javax/sip/SipFactory;

    .line 397
    .line 398
    .line 399
    move-result-object v1

    .line 400
    invoke-virtual {v1}, Landroid/javax/sip/SipFactory;->createHeaderFactory()Landroid/javax/sip/header/HeaderFactory;

    .line 401
    .line 402
    .line 403
    move-result-object v1
    :try_end_0
    .catch Landroid/javax/sip/PeerUnavailableException; {:try_start_0 .. :try_end_0} :catch_1

    .line 404
    invoke-interface {p0}, Landroid/javax/sip/address/SipURI;->getHeaderNames()Ljava/util/Iterator;

    .line 405
    .line 406
    .line 407
    move-result-object v3

    .line 408
    :cond_22
    :goto_10
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 409
    .line 410
    .line 411
    move-result v4

    .line 412
    if-eqz v4, :cond_26

    .line 413
    .line 414
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 415
    .line 416
    .line 417
    move-result-object v4

    .line 418
    check-cast v4, Ljava/lang/String;

    .line 419
    .line 420
    invoke-interface {p0, v4}, Landroid/javax/sip/address/SipURI;->getHeader(Ljava/lang/String;)Ljava/lang/String;

    .line 421
    .line 422
    .line 423
    move-result-object v5

    .line 424
    invoke-interface {p1, v4}, Landroid/javax/sip/address/SipURI;->getHeader(Ljava/lang/String;)Ljava/lang/String;

    .line 425
    .line 426
    .line 427
    move-result-object v6

    .line 428
    if-nez v5, :cond_23

    .line 429
    .line 430
    if-eqz v6, :cond_23

    .line 431
    .line 432
    return v2

    .line 433
    :cond_23
    if-nez v6, :cond_24

    .line 434
    .line 435
    if-eqz v5, :cond_24

    .line 436
    .line 437
    return v2

    .line 438
    :cond_24
    if-nez v5, :cond_25

    .line 439
    .line 440
    if-nez v6, :cond_25

    .line 441
    .line 442
    goto :goto_10

    .line 443
    :cond_25
    :try_start_1
    invoke-static {v5}, Landroid/gov/nist/javax/sip/address/UriDecoder;->decode(Ljava/lang/String;)Ljava/lang/String;

    .line 444
    .line 445
    .line 446
    move-result-object v5

    .line 447
    invoke-interface {v1, v4, v5}, Landroid/javax/sip/header/HeaderFactory;->createHeader(Ljava/lang/String;Ljava/lang/String;)Landroid/javax/sip/header/Header;

    .line 448
    .line 449
    .line 450
    move-result-object v5

    .line 451
    invoke-static {v6}, Landroid/gov/nist/javax/sip/address/UriDecoder;->decode(Ljava/lang/String;)Ljava/lang/String;

    .line 452
    .line 453
    .line 454
    move-result-object v6

    .line 455
    invoke-interface {v1, v4, v6}, Landroid/javax/sip/header/HeaderFactory;->createHeader(Ljava/lang/String;Ljava/lang/String;)Landroid/javax/sip/header/Header;

    .line 456
    .line 457
    .line 458
    move-result-object v4

    .line 459
    invoke-interface {v5, v4}, Landroid/javax/sip/header/Header;->equals(Ljava/lang/Object;)Z

    .line 460
    .line 461
    .line 462
    move-result v4
    :try_end_1
    .catch Ljava/text/ParseException; {:try_start_1 .. :try_end_1} :catch_0

    .line 463
    if-nez v4, :cond_22

    .line 464
    .line 465
    return v2

    .line 466
    :catch_0
    move-exception v0

    .line 467
    new-instance v1, Ljava/lang/StringBuilder;

    .line 468
    .line 469
    const-string v3, "Cannot parse one of the header of the sip uris to compare "

    .line 470
    .line 471
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 472
    .line 473
    .line 474
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 475
    .line 476
    .line 477
    const-string p0, " "

    .line 478
    .line 479
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 480
    .line 481
    .line 482
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 483
    .line 484
    .line 485
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 486
    .line 487
    .line 488
    move-result-object p0

    .line 489
    invoke-static {p0, v0}, Landroid/gov/nist/core/Debug;->logError(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 490
    .line 491
    .line 492
    return v2

    .line 493
    :catch_1
    move-exception p0

    .line 494
    const-string p1, "Cannot get the header factory to parse the header of the sip uris to compare"

    .line 495
    .line 496
    invoke-static {p1, p0}, Landroid/gov/nist/core/Debug;->logError(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 497
    .line 498
    .line 499
    return v2

    .line 500
    :cond_26
    return v0

    .line 501
    :cond_27
    return v2
.end method

.method public getAuthority()Landroid/gov/nist/javax/sip/address/Authority;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/SipUri;->authority:Landroid/gov/nist/javax/sip/address/Authority;

    .line 2
    .line 3
    return-object p0
.end method

.method public getGrParam()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/SipUri;->uriParms:Landroid/gov/nist/core/NameValueList;

    .line 2
    .line 3
    const-string v0, "gr"

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Landroid/gov/nist/core/NameValueList;->getValue(Ljava/lang/String;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Ljava/lang/String;

    .line 10
    .line 11
    return-object p0
.end method

.method public getHeader(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/address/SipUri;->qheaders:Landroid/gov/nist/core/NameValueList;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/gov/nist/core/NameValueList;->getValue(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/SipUri;->qheaders:Landroid/gov/nist/core/NameValueList;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Landroid/gov/nist/core/NameValueList;->getValue(Ljava/lang/String;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    :cond_0
    const/4 p0, 0x0

    .line 21
    return-object p0
.end method

.method public getHeaderNames()Ljava/util/Iterator;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/SipUri;->qheaders:Landroid/gov/nist/core/NameValueList;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/gov/nist/core/NameValueList;->getNames()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getHost()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/address/SipUri;->authority:Landroid/gov/nist/javax/sip/address/Authority;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return-object v1

    .line 7
    :cond_0
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/address/Authority;->getHost()Landroid/gov/nist/core/Host;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    return-object v1

    .line 14
    :cond_1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/SipUri;->authority:Landroid/gov/nist/javax/sip/address/Authority;

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/address/Authority;->getHost()Landroid/gov/nist/core/Host;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {p0}, Landroid/gov/nist/core/Host;->encode()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method

.method public getHostPort()Landroid/gov/nist/core/HostPort;
    .locals 1

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/address/SipUri;->authority:Landroid/gov/nist/javax/sip/address/Authority;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/address/Authority;->getHost()Landroid/gov/nist/core/Host;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/SipUri;->authority:Landroid/gov/nist/javax/sip/address/Authority;

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/address/Authority;->getHostPort()Landroid/gov/nist/core/HostPort;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0

    .line 19
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 20
    return-object p0
.end method

.method public getLrParam()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "lr"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/address/SipUri;->hasParameter(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    const-string p0, "true"

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return-object p0
.end method

.method public getMAddrParam()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/SipUri;->uriParms:Landroid/gov/nist/core/NameValueList;

    .line 2
    .line 3
    const-string v0, "maddr"

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Landroid/gov/nist/core/NameValueList;->getNameValue(Ljava/lang/String;)Landroid/gov/nist/core/NameValue;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return-object p0

    .line 13
    :cond_0
    invoke-virtual {p0}, Landroid/gov/nist/core/NameValue;->getValueAsObject()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, Ljava/lang/String;

    .line 18
    .line 19
    return-object p0
.end method

.method public getMethod()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "method"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/address/SipUri;->getParm(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/String;

    .line 8
    .line 9
    return-object p0
.end method

.method public getMethodParam()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "method"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/address/SipUri;->getParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getParameter(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/SipUri;->uriParms:Landroid/gov/nist/core/NameValueList;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/gov/nist/core/NameValueList;->getValue(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    return-object p0

    .line 11
    :cond_0
    instance-of p1, p0, Landroid/gov/nist/core/GenericObject;

    .line 12
    .line 13
    if-eqz p1, :cond_1

    .line 14
    .line 15
    check-cast p0, Landroid/gov/nist/core/GenericObject;

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/gov/nist/core/GenericObject;->encode()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method public getParameterNames()Ljava/util/Iterator;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/SipUri;->uriParms:Landroid/gov/nist/core/NameValueList;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/gov/nist/core/NameValueList;->getNames()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getParameters()Landroid/gov/nist/core/NameValueList;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/SipUri;->uriParms:Landroid/gov/nist/core/NameValueList;

    .line 2
    .line 3
    return-object p0
.end method

.method public getParm(Ljava/lang/String;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/SipUri;->uriParms:Landroid/gov/nist/core/NameValueList;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/gov/nist/core/NameValueList;->getValue(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getPort()I
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/address/SipUri;->getHostPort()Landroid/gov/nist/core/HostPort;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    const/4 p0, -0x1

    .line 8
    return p0

    .line 9
    :cond_0
    invoke-virtual {p0}, Landroid/gov/nist/core/HostPort;->getPort()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public getQheaders()Landroid/gov/nist/core/NameValueList;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/SipUri;->qheaders:Landroid/gov/nist/core/NameValueList;

    .line 2
    .line 3
    return-object p0
.end method

.method public getScheme()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/GenericURI;->scheme:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getTTLParam()I
    .locals 1

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/SipUri;->uriParms:Landroid/gov/nist/core/NameValueList;

    .line 2
    .line 3
    const-string v0, "ttl"

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Landroid/gov/nist/core/NameValueList;->getValue(Ljava/lang/String;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Ljava/lang/Integer;

    .line 10
    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0

    .line 18
    :cond_0
    const/4 p0, -0x1

    .line 19
    return p0
.end method

.method public getTelephoneSubscriber()Landroid/gov/nist/javax/sip/address/TelephoneNumber;
    .locals 1

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/address/SipUri;->telephoneSubscriber:Landroid/gov/nist/javax/sip/address/TelephoneNumber;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroid/gov/nist/javax/sip/address/TelephoneNumber;

    .line 6
    .line 7
    invoke-direct {v0}, Landroid/gov/nist/javax/sip/address/TelephoneNumber;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Landroid/gov/nist/javax/sip/address/SipUri;->telephoneSubscriber:Landroid/gov/nist/javax/sip/address/TelephoneNumber;

    .line 11
    .line 12
    :cond_0
    return-object v0
.end method

.method public getTransportParam()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/SipUri;->uriParms:Landroid/gov/nist/core/NameValueList;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const-string v0, "transport"

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Landroid/gov/nist/core/NameValueList;->getValue(Ljava/lang/String;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Ljava/lang/String;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return-object p0
.end method

.method public getUser()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/SipUri;->authority:Landroid/gov/nist/javax/sip/address/Authority;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/address/Authority;->getUser()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getUserAtHost()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/address/SipUri;->authority:Landroid/gov/nist/javax/sip/address/Authority;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/address/Authority;->getUserInfo()Landroid/gov/nist/javax/sip/address/UserInfo;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, ""

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Landroid/gov/nist/javax/sip/address/SipUri;->authority:Landroid/gov/nist/javax/sip/address/Authority;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/address/Authority;->getUserInfo()Landroid/gov/nist/javax/sip/address/UserInfo;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/address/UserInfo;->getUser()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move-object v0, v1

    .line 23
    :goto_0
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/SipUri;->authority:Landroid/gov/nist/javax/sip/address/Authority;

    .line 24
    .line 25
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/address/Authority;->getHost()Landroid/gov/nist/core/Host;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {p0}, Landroid/gov/nist/core/Host;->encode()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_1

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    const-string v1, "@"

    .line 43
    .line 44
    invoke-static {v0, v1}, La/brm0;->t(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    goto :goto_2

    .line 49
    :cond_2
    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 52
    .line 53
    .line 54
    :goto_2
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0
.end method

.method public getUserAtHostPort()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/address/SipUri;->authority:Landroid/gov/nist/javax/sip/address/Authority;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/address/Authority;->getUserInfo()Landroid/gov/nist/javax/sip/address/UserInfo;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, ""

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Landroid/gov/nist/javax/sip/address/SipUri;->authority:Landroid/gov/nist/javax/sip/address/Authority;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/address/Authority;->getUserInfo()Landroid/gov/nist/javax/sip/address/UserInfo;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/address/UserInfo;->getUser()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move-object v0, v1

    .line 23
    :goto_0
    iget-object v2, p0, Landroid/gov/nist/javax/sip/address/SipUri;->authority:Landroid/gov/nist/javax/sip/address/Authority;

    .line 24
    .line 25
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/address/Authority;->getHost()Landroid/gov/nist/core/Host;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v2}, Landroid/gov/nist/core/Host;->encode()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/SipUri;->authority:Landroid/gov/nist/javax/sip/address/Authority;

    .line 34
    .line 35
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/address/Authority;->getPort()I

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_1

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    const-string v1, "@"

    .line 49
    .line 50
    invoke-static {v0, v1}, La/brm0;->t(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    goto :goto_2

    .line 55
    :cond_2
    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 58
    .line 59
    .line 60
    :goto_2
    const/4 v1, -0x1

    .line 61
    if-eq p0, v1, :cond_3

    .line 62
    .line 63
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    const-string v1, ":"

    .line 67
    .line 68
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    return-object p0

    .line 79
    :cond_3
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    return-object p0
.end method

.method public getUserParam()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "user"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/address/SipUri;->getParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getUserPassword()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/SipUri;->authority:Landroid/gov/nist/javax/sip/address/Authority;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return-object p0

    .line 7
    :cond_0
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/address/Authority;->getPassword()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public getUserType()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/SipUri;->uriParms:Landroid/gov/nist/core/NameValueList;

    .line 2
    .line 3
    const-string v0, "user"

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Landroid/gov/nist/core/NameValueList;->getValue(Ljava/lang/String;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Ljava/lang/String;

    .line 10
    .line 11
    return-object p0
.end method

.method public hasGrParam()Z
    .locals 1

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/SipUri;->uriParms:Landroid/gov/nist/core/NameValueList;

    .line 2
    .line 3
    const-string v0, "gr"

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Landroid/gov/nist/core/NameValueList;->getNameValue(Ljava/lang/String;)Landroid/gov/nist/core/NameValue;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return p0
.end method

.method public hasLrParam()Z
    .locals 1

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/SipUri;->uriParms:Landroid/gov/nist/core/NameValueList;

    .line 2
    .line 3
    const-string v0, "lr"

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Landroid/gov/nist/core/NameValueList;->getNameValue(Ljava/lang/String;)Landroid/gov/nist/core/NameValue;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return p0
.end method

.method public hasParameter(Ljava/lang/String;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/SipUri;->uriParms:Landroid/gov/nist/core/NameValueList;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/gov/nist/core/NameValueList;->getValue(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public hasTransport()Z
    .locals 1

    .line 1
    const-string v0, "transport"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/address/SipUri;->hasParameter(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public isSecure()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/address/SipUri;->getScheme()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string v0, "sips"

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public isSipURI()Z
    .locals 0

    const/4 p0, 0x1

    return p0
.end method

.method public isUserTelephoneSubscriber()Z
    .locals 1

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/SipUri;->uriParms:Landroid/gov/nist/core/NameValueList;

    .line 2
    .line 3
    const-string v0, "user"

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Landroid/gov/nist/core/NameValueList;->getValue(Ljava/lang/String;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Ljava/lang/String;

    .line 10
    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    return p0

    .line 15
    :cond_0
    const-string v0, "phone"

    .line 16
    .line 17
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    return p0
.end method

.method public removeHeader(Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/SipUri;->qheaders:Landroid/gov/nist/core/NameValueList;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroid/gov/nist/core/NameValueList;->delete(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public removeHeaders()V
    .locals 1

    .line 1
    new-instance v0, Landroid/gov/nist/core/NameValueList;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/gov/nist/core/NameValueList;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Landroid/gov/nist/javax/sip/address/SipUri;->qheaders:Landroid/gov/nist/core/NameValueList;

    .line 7
    .line 8
    return-void
.end method

.method public removeMAddr()V
    .locals 1

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/SipUri;->uriParms:Landroid/gov/nist/core/NameValueList;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const-string v0, "maddr"

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Landroid/gov/nist/core/NameValueList;->delete(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public removeMethod()V
    .locals 1

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/SipUri;->uriParms:Landroid/gov/nist/core/NameValueList;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const-string v0, "method"

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Landroid/gov/nist/core/NameValueList;->delete(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public removeParameter(Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/SipUri;->uriParms:Landroid/gov/nist/core/NameValueList;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/gov/nist/core/NameValueList;->delete(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public removeParameters()V
    .locals 1

    .line 1
    new-instance v0, Landroid/gov/nist/core/NameValueList;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/gov/nist/core/NameValueList;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Landroid/gov/nist/javax/sip/address/SipUri;->uriParms:Landroid/gov/nist/core/NameValueList;

    .line 7
    .line 8
    return-void
.end method

.method public removePort()V
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/SipUri;->authority:Landroid/gov/nist/javax/sip/address/Authority;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/address/Authority;->removePort()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public removeTTL()V
    .locals 1

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/SipUri;->uriParms:Landroid/gov/nist/core/NameValueList;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const-string v0, "ttl"

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Landroid/gov/nist/core/NameValueList;->delete(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public removeTransport()V
    .locals 1

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/SipUri;->uriParms:Landroid/gov/nist/core/NameValueList;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const-string v0, "transport"

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Landroid/gov/nist/core/NameValueList;->delete(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public removeUser()V
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/SipUri;->authority:Landroid/gov/nist/javax/sip/address/Authority;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/address/Authority;->removeUserInfo()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public removeUserType()V
    .locals 1

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/SipUri;->uriParms:Landroid/gov/nist/core/NameValueList;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const-string v0, "user"

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Landroid/gov/nist/core/NameValueList;->delete(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public setAuthority(Landroid/gov/nist/javax/sip/address/Authority;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/address/SipUri;->authority:Landroid/gov/nist/javax/sip/address/Authority;

    .line 2
    .line 3
    return-void
.end method

.method public setDefaultParm(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/address/SipUri;->uriParms:Landroid/gov/nist/core/NameValueList;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/gov/nist/core/NameValueList;->getValue(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Landroid/gov/nist/core/NameValue;

    .line 10
    .line 11
    invoke-direct {v0, p1, p2}, Landroid/gov/nist/core/NameValue;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/SipUri;->uriParms:Landroid/gov/nist/core/NameValueList;

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Landroid/gov/nist/core/NameValueList;->set(Landroid/gov/nist/core/NameValue;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public setGrParam(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/SipUri;->uriParms:Landroid/gov/nist/core/NameValueList;

    .line 2
    .line 3
    const-string v0, "gr"

    .line 4
    .line 5
    invoke-virtual {p0, v0, p1}, Landroid/gov/nist/core/NameValueList;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setHeader(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Landroid/gov/nist/core/NameValue;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Landroid/gov/nist/core/NameValue;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/SipUri;->qheaders:Landroid/gov/nist/core/NameValueList;

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroid/gov/nist/core/NameValueList;->set(Landroid/gov/nist/core/NameValue;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setHost(Landroid/gov/nist/core/Host;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/address/SipUri;->authority:Landroid/gov/nist/javax/sip/address/Authority;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroid/gov/nist/javax/sip/address/Authority;

    .line 6
    .line 7
    invoke-direct {v0}, Landroid/gov/nist/javax/sip/address/Authority;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Landroid/gov/nist/javax/sip/address/SipUri;->authority:Landroid/gov/nist/javax/sip/address/Authority;

    .line 11
    .line 12
    :cond_0
    invoke-virtual {v0, p1}, Landroid/gov/nist/javax/sip/address/Authority;->setHost(Landroid/gov/nist/core/Host;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public setHost(Ljava/lang/String;)V
    .locals 1

    .line 16
    new-instance v0, Landroid/gov/nist/core/Host;

    invoke-direct {v0, p1}, Landroid/gov/nist/core/Host;-><init>(Ljava/lang/String;)V

    .line 17
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/address/SipUri;->setHost(Landroid/gov/nist/core/Host;)V

    return-void
.end method

.method public setHostPort(Landroid/gov/nist/core/HostPort;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/address/SipUri;->authority:Landroid/gov/nist/javax/sip/address/Authority;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroid/gov/nist/javax/sip/address/Authority;

    .line 6
    .line 7
    invoke-direct {v0}, Landroid/gov/nist/javax/sip/address/Authority;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Landroid/gov/nist/javax/sip/address/SipUri;->authority:Landroid/gov/nist/javax/sip/address/Authority;

    .line 11
    .line 12
    :cond_0
    invoke-virtual {v0, p1}, Landroid/gov/nist/javax/sip/address/Authority;->setHostPort(Landroid/gov/nist/core/HostPort;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public setIsdnSubAddress(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/address/SipUri;->telephoneSubscriber:Landroid/gov/nist/javax/sip/address/TelephoneNumber;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroid/gov/nist/javax/sip/address/TelephoneNumber;

    .line 6
    .line 7
    invoke-direct {v0}, Landroid/gov/nist/javax/sip/address/TelephoneNumber;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Landroid/gov/nist/javax/sip/address/SipUri;->telephoneSubscriber:Landroid/gov/nist/javax/sip/address/TelephoneNumber;

    .line 11
    .line 12
    :cond_0
    invoke-virtual {v0, p1}, Landroid/gov/nist/javax/sip/address/TelephoneNumber;->setIsdnSubaddress(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public setLrParam()V
    .locals 2

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/SipUri;->uriParms:Landroid/gov/nist/core/NameValueList;

    .line 2
    .line 3
    const-string v0, "lr"

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {p0, v0, v1}, Landroid/gov/nist/core/NameValueList;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setMAddr(Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/address/SipUri;->uriParms:Landroid/gov/nist/core/NameValueList;

    .line 2
    .line 3
    const-string v1, "maddr"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/gov/nist/core/NameValueList;->getNameValue(Ljava/lang/String;)Landroid/gov/nist/core/NameValue;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v2, Landroid/gov/nist/core/Host;

    .line 10
    .line 11
    invoke-direct {v2}, Landroid/gov/nist/core/Host;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v2, p1}, Landroid/gov/nist/core/Host;->setAddress(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {v0, v2}, Landroid/gov/nist/core/NameValue;->setValueAsObject(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    new-instance p1, Landroid/gov/nist/core/NameValue;

    .line 24
    .line 25
    invoke-direct {p1, v1, v2}, Landroid/gov/nist/core/NameValue;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/SipUri;->uriParms:Landroid/gov/nist/core/NameValueList;

    .line 29
    .line 30
    invoke-virtual {p0, p1}, Landroid/gov/nist/core/NameValueList;->set(Landroid/gov/nist/core/NameValue;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public setMAddrParam(Ljava/lang/String;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const-string v0, "maddr"

    .line 4
    .line 5
    invoke-virtual {p0, v0, p1}, Landroid/gov/nist/javax/sip/address/SipUri;->setParameter(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    const-string p0, "bad maddr"

    .line 10
    .line 11
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public setMethod(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/SipUri;->uriParms:Landroid/gov/nist/core/NameValueList;

    .line 2
    .line 3
    const-string v0, "method"

    .line 4
    .line 5
    invoke-virtual {p0, v0, p1}, Landroid/gov/nist/core/NameValueList;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setMethodParam(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "method"

    .line 2
    .line 3
    invoke-virtual {p0, v0, p1}, Landroid/gov/nist/javax/sip/address/SipUri;->setParameter(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setParameter(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "ttl"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    :try_start_0
    invoke-static {p2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :catch_0
    const-string p0, "bad parameter "

    .line 14
    .line 15
    invoke-static {p0, p2}, La/kng0;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    const/4 p1, 0x0

    .line 20
    invoke-static {p1, p0}, La/hny;->j(ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    :goto_0
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/SipUri;->uriParms:Landroid/gov/nist/core/NameValueList;

    .line 25
    .line 26
    invoke-virtual {p0, p1, p2}, Landroid/gov/nist/core/NameValueList;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public setPort(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/address/SipUri;->authority:Landroid/gov/nist/javax/sip/address/Authority;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroid/gov/nist/javax/sip/address/Authority;

    .line 6
    .line 7
    invoke-direct {v0}, Landroid/gov/nist/javax/sip/address/Authority;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Landroid/gov/nist/javax/sip/address/SipUri;->authority:Landroid/gov/nist/javax/sip/address/Authority;

    .line 11
    .line 12
    :cond_0
    invoke-virtual {v0, p1}, Landroid/gov/nist/javax/sip/address/Authority;->setPort(I)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public setQHeader(Landroid/gov/nist/core/NameValue;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/SipUri;->qheaders:Landroid/gov/nist/core/NameValueList;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/gov/nist/core/NameValueList;->set(Landroid/gov/nist/core/NameValue;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setQheaders(Landroid/gov/nist/core/NameValueList;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/address/SipUri;->qheaders:Landroid/gov/nist/core/NameValueList;

    .line 2
    .line 3
    return-void
.end method

.method public setScheme(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "sip"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->compareToIgnoreCase(Ljava/lang/String;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    const-string v0, "sips"

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Ljava/lang/String;->compareToIgnoreCase(Ljava/lang/String;)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const-string p0, "bad scheme "

    .line 19
    .line 20
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iput-object p1, p0, Landroid/gov/nist/javax/sip/address/GenericURI;->scheme:Ljava/lang/String;

    .line 33
    .line 34
    return-void
.end method

.method public setSecure(Z)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const-string p1, "sips"

    .line 4
    .line 5
    iput-object p1, p0, Landroid/gov/nist/javax/sip/address/GenericURI;->scheme:Ljava/lang/String;

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    const-string p1, "sip"

    .line 9
    .line 10
    iput-object p1, p0, Landroid/gov/nist/javax/sip/address/GenericURI;->scheme:Ljava/lang/String;

    .line 11
    .line 12
    return-void
.end method

.method public setTTLParam(I)V
    .locals 2

    .line 1
    if-lez p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Landroid/gov/nist/javax/sip/address/SipUri;->uriParms:Landroid/gov/nist/core/NameValueList;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Landroid/gov/nist/core/NameValue;

    .line 8
    .line 9
    const-string v1, "ttl"

    .line 10
    .line 11
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-direct {v0, v1, p1}, Landroid/gov/nist/core/NameValue;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/SipUri;->uriParms:Landroid/gov/nist/core/NameValueList;

    .line 19
    .line 20
    invoke-virtual {p0, v0}, Landroid/gov/nist/core/NameValueList;->set(Landroid/gov/nist/core/NameValue;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void

    .line 24
    :cond_1
    const-string p0, "Bad ttl value"

    .line 25
    .line 26
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public setTelephoneSubscriber(Landroid/gov/nist/javax/sip/address/TelephoneNumber;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/address/SipUri;->telephoneSubscriber:Landroid/gov/nist/javax/sip/address/TelephoneNumber;

    .line 2
    .line 3
    return-void
.end method

.method public setTransportParam(Ljava/lang/String;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance v0, Landroid/gov/nist/core/NameValue;

    .line 4
    .line 5
    const-string v1, "transport"

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-direct {v0, v1, p1}, Landroid/gov/nist/core/NameValue;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/SipUri;->uriParms:Landroid/gov/nist/core/NameValueList;

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Landroid/gov/nist/core/NameValueList;->set(Landroid/gov/nist/core/NameValue;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    const-string p0, "null arg"

    .line 21
    .line 22
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public setUriParameter(Landroid/gov/nist/core/NameValue;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/SipUri;->uriParms:Landroid/gov/nist/core/NameValueList;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/gov/nist/core/NameValueList;->set(Landroid/gov/nist/core/NameValue;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setUriParm(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    .line 1
    new-instance v0, Landroid/gov/nist/core/NameValue;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Landroid/gov/nist/core/NameValue;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/SipUri;->uriParms:Landroid/gov/nist/core/NameValueList;

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroid/gov/nist/core/NameValueList;->set(Landroid/gov/nist/core/NameValue;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setUriParms(Landroid/gov/nist/core/NameValueList;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/address/SipUri;->uriParms:Landroid/gov/nist/core/NameValueList;

    .line 2
    .line 3
    return-void
.end method

.method public setUser(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/address/SipUri;->authority:Landroid/gov/nist/javax/sip/address/Authority;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroid/gov/nist/javax/sip/address/Authority;

    .line 6
    .line 7
    invoke-direct {v0}, Landroid/gov/nist/javax/sip/address/Authority;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Landroid/gov/nist/javax/sip/address/SipUri;->authority:Landroid/gov/nist/javax/sip/address/Authority;

    .line 11
    .line 12
    :cond_0
    invoke-virtual {v0, p1}, Landroid/gov/nist/javax/sip/address/Authority;->setUser(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public setUserParam(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/SipUri;->uriParms:Landroid/gov/nist/core/NameValueList;

    .line 2
    .line 3
    const-string v0, "user"

    .line 4
    .line 5
    invoke-virtual {p0, v0, p1}, Landroid/gov/nist/core/NameValueList;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setUserPassword(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/address/SipUri;->authority:Landroid/gov/nist/javax/sip/address/Authority;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroid/gov/nist/javax/sip/address/Authority;

    .line 6
    .line 7
    invoke-direct {v0}, Landroid/gov/nist/javax/sip/address/Authority;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Landroid/gov/nist/javax/sip/address/SipUri;->authority:Landroid/gov/nist/javax/sip/address/Authority;

    .line 11
    .line 12
    :cond_0
    invoke-virtual {v0, p1}, Landroid/gov/nist/javax/sip/address/Authority;->setPassword(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/address/SipUri;->encode()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method
