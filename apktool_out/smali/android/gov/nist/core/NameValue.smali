.class public Landroid/gov/nist/core/NameValue;
.super Landroid/gov/nist/core/GenericObject;
.source "SourceFile"

# interfaces
.implements Ljava/util/Map$Entry;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/gov/nist/core/GenericObject;",
        "Ljava/util/Map$Entry<",
        "Ljava/lang/String;",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x19c7fab1bcbf73beL


# instance fields
.field protected final isFlagParameter:Z

.field protected isQuotedString:Z

.field private name:Ljava/lang/String;

.field private quotes:Ljava/lang/String;

.field private separator:Ljava/lang/String;

.field private value:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroid/gov/nist/core/GenericObject;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Landroid/gov/nist/core/NameValue;->name:Ljava/lang/String;

    .line 6
    .line 7
    const-string v0, ""

    .line 8
    .line 9
    iput-object v0, p0, Landroid/gov/nist/core/NameValue;->value:Ljava/lang/Object;

    .line 10
    .line 11
    const-string v1, "="

    .line 12
    .line 13
    iput-object v1, p0, Landroid/gov/nist/core/NameValue;->separator:Ljava/lang/String;

    .line 14
    .line 15
    iput-object v0, p0, Landroid/gov/nist/core/NameValue;->quotes:Ljava/lang/String;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    iput-boolean v0, p0, Landroid/gov/nist/core/NameValue;->isFlagParameter:Z

    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    const/4 v0, 0x0

    .line 27
    invoke-direct {p0, p1, p2, v0}, Landroid/gov/nist/core/NameValue;-><init>(Ljava/lang/String;Ljava/lang/Object;Z)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Object;Z)V
    .locals 0

    .line 21
    invoke-direct {p0}, Landroid/gov/nist/core/GenericObject;-><init>()V

    .line 22
    iput-object p1, p0, Landroid/gov/nist/core/NameValue;->name:Ljava/lang/String;

    .line 23
    iput-object p2, p0, Landroid/gov/nist/core/NameValue;->value:Ljava/lang/Object;

    .line 24
    const-string p1, "="

    iput-object p1, p0, Landroid/gov/nist/core/NameValue;->separator:Ljava/lang/String;

    .line 25
    const-string p1, ""

    iput-object p1, p0, Landroid/gov/nist/core/NameValue;->quotes:Ljava/lang/String;

    .line 26
    iput-boolean p3, p0, Landroid/gov/nist/core/NameValue;->isFlagParameter:Z

    return-void
.end method


# virtual methods
.method public clone()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/gov/nist/core/GenericObject;->clone()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Landroid/gov/nist/core/NameValue;

    .line 6
    .line 7
    iget-object p0, p0, Landroid/gov/nist/core/NameValue;->value:Ljava/lang/Object;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-static {p0}, Landroid/gov/nist/core/GenericObject;->makeClone(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    iput-object p0, v0, Landroid/gov/nist/core/NameValue;->value:Ljava/lang/Object;

    .line 16
    .line 17
    :cond_0
    return-object v0
.end method

.method public encode()Ljava/lang/String;
    .locals 1

    .line 237
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v0}, Landroid/gov/nist/core/NameValue;->encode(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public encode(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;
    .locals 3

    .line 1
    iget-object v0, p0, Landroid/gov/nist/core/NameValue;->name:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_4

    .line 4
    .line 5
    iget-object v1, p0, Landroid/gov/nist/core/NameValue;->value:Ljava/lang/Object;

    .line 6
    .line 7
    if-eqz v1, :cond_4

    .line 8
    .line 9
    iget-boolean v2, p0, Landroid/gov/nist/core/NameValue;->isFlagParameter:Z

    .line 10
    .line 11
    if-nez v2, :cond_4

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, Landroid/gov/nist/core/GenericObject;->isMySubclass(Ljava/lang/Class;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    iget-object v1, p0, Landroid/gov/nist/core/NameValue;->value:Ljava/lang/Object;

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    check-cast v1, Landroid/gov/nist/core/GenericObject;

    .line 26
    .line 27
    iget-object v0, p0, Landroid/gov/nist/core/NameValue;->name:Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Landroid/gov/nist/core/NameValue;->separator:Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Landroid/gov/nist/core/NameValue;->quotes:Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1, p1}, Landroid/gov/nist/core/GenericObject;->encode(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    iget-object p0, p0, Landroid/gov/nist/core/NameValue;->quotes:Ljava/lang/String;

    .line 46
    .line 47
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    return-object p1

    .line 51
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-static {v0}, Landroid/gov/nist/core/GenericObjectList;->isMySubclass(Ljava/lang/Class;)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    iget-object v1, p0, Landroid/gov/nist/core/NameValue;->value:Ljava/lang/Object;

    .line 60
    .line 61
    if-eqz v0, :cond_1

    .line 62
    .line 63
    check-cast v1, Landroid/gov/nist/core/GenericObjectList;

    .line 64
    .line 65
    iget-object v0, p0, Landroid/gov/nist/core/NameValue;->name:Ljava/lang/String;

    .line 66
    .line 67
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    iget-object p0, p0, Landroid/gov/nist/core/NameValue;->separator:Ljava/lang/String;

    .line 71
    .line 72
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1}, Landroid/gov/nist/core/GenericObjectList;->encode()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    return-object p1

    .line 83
    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    if-nez v0, :cond_3

    .line 92
    .line 93
    iget-boolean v0, p0, Landroid/gov/nist/core/NameValue;->isQuotedString:Z

    .line 94
    .line 95
    iget-object v1, p0, Landroid/gov/nist/core/NameValue;->name:Ljava/lang/String;

    .line 96
    .line 97
    if-eqz v0, :cond_2

    .line 98
    .line 99
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    iget-object v0, p0, Landroid/gov/nist/core/NameValue;->separator:Ljava/lang/String;

    .line 103
    .line 104
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    iget-object v0, p0, Landroid/gov/nist/core/NameValue;->quotes:Ljava/lang/String;

    .line 108
    .line 109
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    iget-object p0, p0, Landroid/gov/nist/core/NameValue;->quotes:Ljava/lang/String;

    .line 113
    .line 114
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    return-object p1

    .line 118
    :cond_2
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    iget-object p0, p0, Landroid/gov/nist/core/NameValue;->separator:Ljava/lang/String;

    .line 122
    .line 123
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    return-object p1

    .line 127
    :cond_3
    iget-object v0, p0, Landroid/gov/nist/core/NameValue;->name:Ljava/lang/String;

    .line 128
    .line 129
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    iget-object v0, p0, Landroid/gov/nist/core/NameValue;->separator:Ljava/lang/String;

    .line 133
    .line 134
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    iget-object v0, p0, Landroid/gov/nist/core/NameValue;->quotes:Ljava/lang/String;

    .line 138
    .line 139
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    iget-object v0, p0, Landroid/gov/nist/core/NameValue;->value:Ljava/lang/Object;

    .line 143
    .line 144
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    iget-object p0, p0, Landroid/gov/nist/core/NameValue;->quotes:Ljava/lang/String;

    .line 152
    .line 153
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    return-object p1

    .line 157
    :cond_4
    if-nez v0, :cond_7

    .line 158
    .line 159
    iget-object v1, p0, Landroid/gov/nist/core/NameValue;->value:Ljava/lang/Object;

    .line 160
    .line 161
    if-eqz v1, :cond_7

    .line 162
    .line 163
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    invoke-static {v0}, Landroid/gov/nist/core/GenericObject;->isMySubclass(Ljava/lang/Class;)Z

    .line 168
    .line 169
    .line 170
    move-result v0

    .line 171
    iget-object v1, p0, Landroid/gov/nist/core/NameValue;->value:Ljava/lang/Object;

    .line 172
    .line 173
    if-eqz v0, :cond_5

    .line 174
    .line 175
    check-cast v1, Landroid/gov/nist/core/GenericObject;

    .line 176
    .line 177
    invoke-virtual {v1, p1}, Landroid/gov/nist/core/GenericObject;->encode(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    return-object p1

    .line 181
    :cond_5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    invoke-static {v0}, Landroid/gov/nist/core/GenericObjectList;->isMySubclass(Ljava/lang/Class;)Z

    .line 186
    .line 187
    .line 188
    move-result v0

    .line 189
    if-eqz v0, :cond_6

    .line 190
    .line 191
    iget-object p0, p0, Landroid/gov/nist/core/NameValue;->value:Ljava/lang/Object;

    .line 192
    .line 193
    check-cast p0, Landroid/gov/nist/core/GenericObjectList;

    .line 194
    .line 195
    invoke-virtual {p0}, Landroid/gov/nist/core/GenericObjectList;->encode()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object p0

    .line 199
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    return-object p1

    .line 203
    :cond_6
    iget-object v0, p0, Landroid/gov/nist/core/NameValue;->quotes:Ljava/lang/String;

    .line 204
    .line 205
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 206
    .line 207
    .line 208
    iget-object v0, p0, Landroid/gov/nist/core/NameValue;->value:Ljava/lang/Object;

    .line 209
    .line 210
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 215
    .line 216
    .line 217
    iget-object p0, p0, Landroid/gov/nist/core/NameValue;->quotes:Ljava/lang/String;

    .line 218
    .line 219
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    return-object p1

    .line 223
    :cond_7
    if-eqz v0, :cond_9

    .line 224
    .line 225
    iget-object v1, p0, Landroid/gov/nist/core/NameValue;->value:Ljava/lang/Object;

    .line 226
    .line 227
    if-eqz v1, :cond_8

    .line 228
    .line 229
    iget-boolean p0, p0, Landroid/gov/nist/core/NameValue;->isFlagParameter:Z

    .line 230
    .line 231
    if-eqz p0, :cond_9

    .line 232
    .line 233
    :cond_8
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    :cond_9
    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-nez v1, :cond_1

    .line 18
    .line 19
    return v0

    .line 20
    :cond_1
    check-cast p1, Landroid/gov/nist/core/NameValue;

    .line 21
    .line 22
    const/4 v1, 0x1

    .line 23
    if-ne p0, p1, :cond_2

    .line 24
    .line 25
    return v1

    .line 26
    :cond_2
    iget-object v2, p0, Landroid/gov/nist/core/NameValue;->name:Ljava/lang/String;

    .line 27
    .line 28
    if-nez v2, :cond_3

    .line 29
    .line 30
    iget-object v3, p1, Landroid/gov/nist/core/NameValue;->name:Ljava/lang/String;

    .line 31
    .line 32
    if-nez v3, :cond_4

    .line 33
    .line 34
    :cond_3
    if-eqz v2, :cond_5

    .line 35
    .line 36
    iget-object v3, p1, Landroid/gov/nist/core/NameValue;->name:Ljava/lang/String;

    .line 37
    .line 38
    if-nez v3, :cond_5

    .line 39
    .line 40
    :cond_4
    return v0

    .line 41
    :cond_5
    if-eqz v2, :cond_6

    .line 42
    .line 43
    iget-object v3, p1, Landroid/gov/nist/core/NameValue;->name:Ljava/lang/String;

    .line 44
    .line 45
    if-eqz v3, :cond_6

    .line 46
    .line 47
    invoke-virtual {v2, v3}, Ljava/lang/String;->compareToIgnoreCase(Ljava/lang/String;)I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-eqz v2, :cond_6

    .line 52
    .line 53
    return v0

    .line 54
    :cond_6
    iget-object v2, p0, Landroid/gov/nist/core/NameValue;->value:Ljava/lang/Object;

    .line 55
    .line 56
    if-eqz v2, :cond_7

    .line 57
    .line 58
    iget-object v3, p1, Landroid/gov/nist/core/NameValue;->value:Ljava/lang/Object;

    .line 59
    .line 60
    if-eqz v3, :cond_8

    .line 61
    .line 62
    :cond_7
    if-nez v2, :cond_9

    .line 63
    .line 64
    iget-object v3, p1, Landroid/gov/nist/core/NameValue;->value:Ljava/lang/Object;

    .line 65
    .line 66
    if-eqz v3, :cond_9

    .line 67
    .line 68
    :cond_8
    return v0

    .line 69
    :cond_9
    iget-object p1, p1, Landroid/gov/nist/core/NameValue;->value:Ljava/lang/Object;

    .line 70
    .line 71
    if-ne v2, p1, :cond_a

    .line 72
    .line 73
    return v1

    .line 74
    :cond_a
    instance-of v3, v2, Ljava/lang/String;

    .line 75
    .line 76
    if-eqz v3, :cond_d

    .line 77
    .line 78
    iget-boolean p0, p0, Landroid/gov/nist/core/NameValue;->isQuotedString:Z

    .line 79
    .line 80
    if-eqz p0, :cond_b

    .line 81
    .line 82
    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result p0

    .line 86
    return p0

    .line 87
    :cond_b
    check-cast v2, Ljava/lang/String;

    .line 88
    .line 89
    check-cast p1, Ljava/lang/String;

    .line 90
    .line 91
    invoke-virtual {v2, p1}, Ljava/lang/String;->compareToIgnoreCase(Ljava/lang/String;)I

    .line 92
    .line 93
    .line 94
    move-result p0

    .line 95
    if-nez p0, :cond_c

    .line 96
    .line 97
    return v1

    .line 98
    :cond_c
    return v0

    .line 99
    :cond_d
    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result p0

    .line 103
    return p0
.end method

.method public bridge synthetic getKey()Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/gov/nist/core/NameValue;->getKey()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public getKey()Ljava/lang/String;
    .locals 0

    .line 6
    iget-object p0, p0, Landroid/gov/nist/core/NameValue;->name:Ljava/lang/String;

    return-object p0
.end method

.method public getName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/core/NameValue;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public bridge synthetic getValue()Ljava/lang/Object;
    .locals 0

    .line 12
    invoke-virtual {p0}, Landroid/gov/nist/core/NameValue;->getValue()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public getValue()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/core/NameValue;->value:Ljava/lang/Object;

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
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public getValueAsObject()Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x1

    .line 46
    invoke-virtual {p0, v0}, Landroid/gov/nist/core/NameValue;->getValueAsObject(Z)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public getValueAsObject(Z)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroid/gov/nist/core/NameValue;->isFlagParameter:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string p0, ""

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    if-nez p1, :cond_1

    .line 9
    .line 10
    iget-boolean p1, p0, Landroid/gov/nist/core/NameValue;->isQuotedString:Z

    .line 11
    .line 12
    if-eqz p1, :cond_1

    .line 13
    .line 14
    new-instance p1, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Landroid/gov/nist/core/NameValue;->quotes:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Landroid/gov/nist/core/NameValue;->value:Ljava/lang/Object;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    iget-object p0, p0, Landroid/gov/nist/core/NameValue;->quotes:Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :cond_1
    iget-object p0, p0, Landroid/gov/nist/core/NameValue;->value:Ljava/lang/Object;

    .line 44
    .line 45
    return-object p0
.end method

.method public hashCode()I
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/gov/nist/core/NameValue;->encode()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public isValueQuoted()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroid/gov/nist/core/NameValue;->isQuotedString:Z

    .line 2
    .line 3
    return p0
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/core/NameValue;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setQuotedValue()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroid/gov/nist/core/NameValue;->isQuotedString:Z

    .line 3
    .line 4
    const-string v0, "\""

    .line 5
    .line 6
    iput-object v0, p0, Landroid/gov/nist/core/NameValue;->quotes:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public setSeparator(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/core/NameValue;->separator:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public bridge synthetic setValue(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 11
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Landroid/gov/nist/core/NameValue;->setValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public setValue(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Landroid/gov/nist/core/NameValue;->value:Ljava/lang/Object;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    move-object v0, p1

    .line 8
    :goto_0
    iput-object p1, p0, Landroid/gov/nist/core/NameValue;->value:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public setValueAsObject(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/core/NameValue;->value:Ljava/lang/Object;

    .line 2
    .line 3
    return-void
.end method
