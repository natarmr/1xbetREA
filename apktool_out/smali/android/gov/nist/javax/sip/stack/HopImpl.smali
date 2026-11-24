.class public final Landroid/gov/nist/javax/sip/stack/HopImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/javax/sip/address/Hop;
.implements Ljava/io/Serializable;


# instance fields
.field protected defaultRoute:Z

.field protected host:Ljava/lang/String;

.field protected port:I

.field protected transport:Ljava/lang/String;

.field protected uriRoute:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 7

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    if-eqz p1, :cond_7

    .line 6
    .line 7
    const/16 v1, 0x5d

    .line 8
    .line 9
    invoke-virtual {p1, v1}, Ljava/lang/String;->indexOf(I)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/16 v2, 0x3a

    .line 14
    .line 15
    invoke-virtual {p1, v2, v1}, Ljava/lang/String;->indexOf(II)I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const/16 v3, 0x2f

    .line 20
    .line 21
    invoke-virtual {p1, v3, v2}, Ljava/lang/String;->indexOf(II)I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    const-string v4, "UDP"

    .line 26
    .line 27
    const/4 v5, 0x0

    .line 28
    if-lez v2, :cond_1

    .line 29
    .line 30
    invoke-virtual {p1, v5, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v6

    .line 34
    iput-object v6, p0, Landroid/gov/nist/javax/sip/stack/HopImpl;->host:Ljava/lang/String;

    .line 35
    .line 36
    if-lez v3, :cond_0

    .line 37
    .line 38
    add-int/lit8 v2, v2, 0x1

    .line 39
    .line 40
    invoke-virtual {p1, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    add-int/lit8 v3, v3, 0x1

    .line 45
    .line 46
    invoke-virtual {p1, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/HopImpl;->transport:Ljava/lang/String;

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 54
    .line 55
    invoke-virtual {p1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    iput-object v4, p0, Landroid/gov/nist/javax/sip/stack/HopImpl;->transport:Ljava/lang/String;

    .line 60
    .line 61
    :goto_0
    :try_start_0
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    iput p1, p0, Landroid/gov/nist/javax/sip/stack/HopImpl;->port:I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :catch_0
    const-string p0, "Bad port spec"

    .line 69
    .line 70
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw v0

    .line 74
    :cond_1
    const/16 v2, 0x13c4

    .line 75
    .line 76
    if-lez v3, :cond_3

    .line 77
    .line 78
    invoke-virtual {p1, v5, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    iput-object v4, p0, Landroid/gov/nist/javax/sip/stack/HopImpl;->host:Ljava/lang/String;

    .line 83
    .line 84
    add-int/lit8 v3, v3, 0x1

    .line 85
    .line 86
    invoke-virtual {p1, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/HopImpl;->transport:Ljava/lang/String;

    .line 91
    .line 92
    const-string v3, "TLS"

    .line 93
    .line 94
    invoke-virtual {p1, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    if-eqz p1, :cond_2

    .line 99
    .line 100
    const/16 v2, 0x13c5

    .line 101
    .line 102
    :cond_2
    iput v2, p0, Landroid/gov/nist/javax/sip/stack/HopImpl;->port:I

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_3
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/HopImpl;->host:Ljava/lang/String;

    .line 106
    .line 107
    iput-object v4, p0, Landroid/gov/nist/javax/sip/stack/HopImpl;->transport:Ljava/lang/String;

    .line 108
    .line 109
    iput v2, p0, Landroid/gov/nist/javax/sip/stack/HopImpl;->port:I

    .line 110
    .line 111
    :goto_1
    iget-object p1, p0, Landroid/gov/nist/javax/sip/stack/HopImpl;->host:Ljava/lang/String;

    .line 112
    .line 113
    if-eqz p1, :cond_6

    .line 114
    .line 115
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 116
    .line 117
    .line 118
    move-result p1

    .line 119
    if-eqz p1, :cond_6

    .line 120
    .line 121
    iget-object p1, p0, Landroid/gov/nist/javax/sip/stack/HopImpl;->host:Ljava/lang/String;

    .line 122
    .line 123
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/HopImpl;->host:Ljava/lang/String;

    .line 128
    .line 129
    iget-object p1, p0, Landroid/gov/nist/javax/sip/stack/HopImpl;->transport:Ljava/lang/String;

    .line 130
    .line 131
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/HopImpl;->transport:Ljava/lang/String;

    .line 136
    .line 137
    if-lez v1, :cond_5

    .line 138
    .line 139
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/HopImpl;->host:Ljava/lang/String;

    .line 140
    .line 141
    invoke-virtual {p0, v5}, Ljava/lang/String;->charAt(I)C

    .line 142
    .line 143
    .line 144
    move-result p0

    .line 145
    const/16 p1, 0x5b

    .line 146
    .line 147
    if-ne p0, p1, :cond_4

    .line 148
    .line 149
    goto :goto_2

    .line 150
    :cond_4
    const-string p0, "Bad IPv6 reference spec"

    .line 151
    .line 152
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    throw v0

    .line 156
    :cond_5
    :goto_2
    return-void

    .line 157
    :cond_6
    const-string p0, "no host!"

    .line 158
    .line 159
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    throw v0

    .line 163
    :cond_7
    const-string p0, "Null arg!"

    .line 164
    .line 165
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    throw v0
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 2

    .line 169
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 170
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/HopImpl;->host:Ljava/lang/String;

    .line 171
    const-string v0, ":"

    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result p1

    if-ltz p1, :cond_0

    .line 172
    iget-object p1, p0, Landroid/gov/nist/javax/sip/stack/HopImpl;->host:Ljava/lang/String;

    const-string v0, "["

    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result p1

    if-gez p1, :cond_0

    .line 173
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/HopImpl;->host:Ljava/lang/String;

    const-string v1, "]"

    .line 174
    invoke-static {p1, v0, v1}, La/axq;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 175
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/HopImpl;->host:Ljava/lang/String;

    .line 176
    :cond_0
    iput p2, p0, Landroid/gov/nist/javax/sip/stack/HopImpl;->port:I

    .line 177
    iput-object p3, p0, Landroid/gov/nist/javax/sip/stack/HopImpl;->transport:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getHost()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/HopImpl;->host:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getPort()I
    .locals 0

    .line 1
    iget p0, p0, Landroid/gov/nist/javax/sip/stack/HopImpl;->port:I

    .line 2
    .line 3
    return p0
.end method

.method public getTransport()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/HopImpl;->transport:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public isURIRoute()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroid/gov/nist/javax/sip/stack/HopImpl;->uriRoute:Z

    .line 2
    .line 3
    return p0
.end method

.method public setURIRouteFlag()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroid/gov/nist/javax/sip/stack/HopImpl;->uriRoute:Z

    .line 3
    .line 4
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/HopImpl;->host:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string v1, ":"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    iget v1, p0, Landroid/gov/nist/javax/sip/stack/HopImpl;->port:I

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string v1, "/"

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/HopImpl;->transport:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0
.end method
