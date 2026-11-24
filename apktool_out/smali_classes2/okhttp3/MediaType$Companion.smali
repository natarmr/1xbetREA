.class public final Lokhttp3/MediaType$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/MediaType;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u0008\u00a8\u0006\n"
    }
    d2 = {
        "Lokhttp3/MediaType$Companion;",
        "",
        "",
        "TOKEN",
        "Ljava/lang/String;",
        "QUOTED",
        "Lkotlin/text/Regex;",
        "TYPE_SUBTYPE",
        "Lkotlin/text/Regex;",
        "PARAMETER",
        "okhttp"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static a(Ljava/lang/String;)Lokhttp3/MediaType;
    .locals 13

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lokhttp3/MediaType;->e:Lkotlin/text/Regex;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1, p0}, Lkotlin/text/Regex;->e(ILjava/lang/String;)La/bh30;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/16 v2, 0x22

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    if-eqz v0, :cond_7

    .line 15
    .line 16
    invoke-virtual {v0}, La/bh30;->a()Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    check-cast v4, La/ah30;

    .line 21
    .line 22
    const/4 v5, 0x1

    .line 23
    invoke-virtual {v4, v5}, La/ah30;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    check-cast v4, Ljava/lang/String;

    .line 28
    .line 29
    sget-object v6, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 30
    .line 31
    invoke-virtual {v4, v6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, La/bh30;->a()Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object v7

    .line 42
    check-cast v7, La/ah30;

    .line 43
    .line 44
    const/4 v8, 0x2

    .line 45
    invoke-virtual {v7, v8}, La/ah30;->get(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v7

    .line 49
    check-cast v7, Ljava/lang/String;

    .line 50
    .line 51
    invoke-virtual {v7, v6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    invoke-static {v6}, La/ohs0;->u(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 56
    .line 57
    .line 58
    move-result-object v7

    .line 59
    invoke-virtual {v0}, La/bh30;->b()Lkotlin/ranges/IntRange;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    iget v0, v0, Lkotlin/ranges/a;->b:I

    .line 64
    .line 65
    :goto_0
    add-int/2addr v0, v5

    .line 66
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 67
    .line 68
    .line 69
    move-result v9

    .line 70
    if-ge v0, v9, :cond_6

    .line 71
    .line 72
    sget-object v9, Lokhttp3/MediaType;->f:Lkotlin/text/Regex;

    .line 73
    .line 74
    invoke-virtual {v9, v0, p0}, Lkotlin/text/Regex;->e(ILjava/lang/String;)La/bh30;

    .line 75
    .line 76
    .line 77
    move-result-object v9

    .line 78
    if-eqz v9, :cond_5

    .line 79
    .line 80
    iget-object v0, v9, La/bh30;->c:La/g3;

    .line 81
    .line 82
    invoke-virtual {v0, v5}, La/g3;->e(I)Lkotlin/text/MatchGroup;

    .line 83
    .line 84
    .line 85
    move-result-object v10

    .line 86
    if-eqz v10, :cond_0

    .line 87
    .line 88
    iget-object v10, v10, Lkotlin/text/MatchGroup;->a:Ljava/lang/String;

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_0
    move-object v10, v3

    .line 92
    :goto_1
    if-nez v10, :cond_1

    .line 93
    .line 94
    invoke-virtual {v9}, La/bh30;->b()Lkotlin/ranges/IntRange;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    iget v0, v0, Lkotlin/ranges/a;->b:I

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_1
    invoke-virtual {v0, v8}, La/g3;->e(I)Lkotlin/text/MatchGroup;

    .line 102
    .line 103
    .line 104
    move-result-object v11

    .line 105
    if-eqz v11, :cond_2

    .line 106
    .line 107
    iget-object v11, v11, Lkotlin/text/MatchGroup;->a:Ljava/lang/String;

    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_2
    move-object v11, v3

    .line 111
    :goto_2
    if-nez v11, :cond_3

    .line 112
    .line 113
    const/4 v11, 0x3

    .line 114
    invoke-virtual {v0, v11}, La/g3;->e(I)Lkotlin/text/MatchGroup;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    iget-object v11, v0, Lkotlin/text/MatchGroup;->a:Ljava/lang/String;

    .line 122
    .line 123
    goto :goto_3

    .line 124
    :cond_3
    const/16 v0, 0x27

    .line 125
    .line 126
    invoke-static {v11, v0}, Lkotlin/text/StringsKt;->k0(Ljava/lang/CharSequence;C)Z

    .line 127
    .line 128
    .line 129
    move-result v12

    .line 130
    if-eqz v12, :cond_4

    .line 131
    .line 132
    invoke-static {v11, v0}, Lkotlin/text/StringsKt;->R(Ljava/lang/CharSequence;C)Z

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    if-eqz v0, :cond_4

    .line 137
    .line 138
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    if-le v0, v8, :cond_4

    .line 143
    .line 144
    invoke-static {v5, v5, v11}, La/vqd;->k(IILjava/lang/String;)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v11

    .line 148
    :cond_4
    :goto_3
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    invoke-virtual {v7, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    invoke-virtual {v9}, La/bh30;->b()Lkotlin/ranges/IntRange;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    iget v0, v0, Lkotlin/ranges/a;->b:I

    .line 159
    .line 160
    goto :goto_0

    .line 161
    :cond_5
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    new-instance v1, Ljava/lang/StringBuilder;

    .line 166
    .line 167
    const-string v3, "Parameter is not formatted correctly: \""

    .line 168
    .line 169
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    const-string v0, "\" for: \""

    .line 176
    .line 177
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object p0

    .line 190
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 191
    .line 192
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object p0

    .line 196
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    throw v0

    .line 200
    :cond_6
    new-instance v0, Lokhttp3/MediaType;

    .line 201
    .line 202
    new-array v1, v1, [Ljava/lang/String;

    .line 203
    .line 204
    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    check-cast v1, [Ljava/lang/String;

    .line 209
    .line 210
    invoke-direct {v0, p0, v4, v6, v1}, Lokhttp3/MediaType;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    return-object v0

    .line 214
    :cond_7
    const-string v0, "No subtype found for: \""

    .line 215
    .line 216
    invoke-static {v2, v0, p0}, La/hne;->l(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object p0

    .line 220
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    return-object v3
.end method
