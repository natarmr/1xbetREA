.class public final synthetic La/hot0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/hot0;->a:B

    iput-object p1, p0, La/hot0;->b:Ljava/lang/Object;

    iput-object p2, p0, La/hot0;->c:Ljava/lang/Object;

    iput-object p3, p0, La/hot0;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/hot0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x0

    .line 6
    iget-object v4, p0, La/hot0;->d:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object v5, p0, La/hot0;->c:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object p0, p0, La/hot0;->b:Ljava/lang/Object;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast p0, La/b6v;

    .line 16
    .line 17
    check-cast v5, Lorg/xplatform/cyber/section/api/virtualgamescategories/VirtualGameCategoryParams;

    .line 18
    .line 19
    check-cast v4, La/dqu0;

    .line 20
    .line 21
    iget-object v0, v5, Lorg/xplatform/cyber/section/api/virtualgamescategories/VirtualGameCategoryParams;->a:Ljava/util/ArrayList;

    .line 22
    .line 23
    iget v1, v5, Lorg/xplatform/cyber/section/api/virtualgamescategories/VirtualGameCategoryParams;->b:I

    .line 24
    .line 25
    iget-object v5, p0, La/b6v;->a:La/m1e;

    .line 26
    .line 27
    invoke-interface {v5}, La/m1e;->b()La/gmq;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    new-instance v6, La/a6v;

    .line 32
    .line 33
    invoke-direct {v6, v3, p0, v0, v1}, La/a6v;-><init>(La/yje;La/b6v;Ljava/util/ArrayList;I)V

    .line 34
    .line 35
    .line 36
    invoke-static {v5, v6}, La/aoq;->c(La/gmq;La/xdr;)La/utb;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    new-instance v0, La/bqu0;

    .line 41
    .line 42
    invoke-direct {v0, v4, v3, v2}, La/bqu0;-><init>(La/dqu0;La/yje;B)V

    .line 43
    .line 44
    .line 45
    new-instance v1, La/fnq;

    .line 46
    .line 47
    const/4 v2, 0x4

    .line 48
    invoke-direct {v1, p0, v0, v2}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 49
    .line 50
    .line 51
    invoke-static {v4}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    iget-object v0, v4, La/dqu0;->p:La/mne;

    .line 56
    .line 57
    iget-object v0, v0, La/mne;->a:La/rwj;

    .line 58
    .line 59
    invoke-static {p0, v0}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-static {v1, p0}, La/piz;->O(La/fnq;La/sje;)La/ise0;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    return-object p0

    .line 68
    :pswitch_0
    check-cast p0, La/x1;

    .line 69
    .line 70
    check-cast v5, La/sgu0;

    .line 71
    .line 72
    check-cast v4, La/tgu0;

    .line 73
    .line 74
    invoke-virtual {p0, v5}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 75
    .line 76
    .line 77
    invoke-static {p0}, La/b8k0;->J(Landroid/view/View;)La/zva0;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    iget-object p0, p0, La/zva0;->a:Ljava/util/ArrayList;

    .line 82
    .line 83
    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 87
    .line 88
    return-object p0

    .line 89
    :pswitch_1
    check-cast p0, La/daf;

    .line 90
    .line 91
    check-cast v5, La/i1w0;

    .line 92
    .line 93
    check-cast v4, La/zuc0;

    .line 94
    .line 95
    new-instance v0, La/ast0;

    .line 96
    .line 97
    invoke-direct {v0, p0, v4, v1}, La/ast0;-><init>(La/daf;La/zuc0;B)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v5, v0}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 101
    .line 102
    .line 103
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 104
    .line 105
    return-object p0

    .line 106
    :pswitch_2
    check-cast p0, La/zii0;

    .line 107
    .line 108
    move-object v6, v5

    .line 109
    check-cast v6, La/yz9;

    .line 110
    .line 111
    move-object v10, v4

    .line 112
    check-cast v10, La/sev;

    .line 113
    .line 114
    iget-object v0, p0, La/zii0;->e:La/n0o0;

    .line 115
    .line 116
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    check-cast v0, La/wii0;

    .line 121
    .line 122
    invoke-virtual {v0}, La/wii0;->c()Z

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    if-eqz v0, :cond_0

    .line 127
    .line 128
    iget-object v0, p0, La/zii0;->f:La/n0o0;

    .line 129
    .line 130
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    check-cast v0, La/xii0;

    .line 135
    .line 136
    move-object v8, v0

    .line 137
    goto :goto_0

    .line 138
    :cond_0
    move-object v8, v3

    .line 139
    :goto_0
    if-nez v8, :cond_1

    .line 140
    .line 141
    :goto_1
    move v7, v2

    .line 142
    goto :goto_2

    .line 143
    :cond_1
    iget v0, v8, La/xii0;->h:I

    .line 144
    .line 145
    if-ne v0, v1, :cond_2

    .line 146
    .line 147
    move v7, v1

    .line 148
    goto :goto_2

    .line 149
    :cond_2
    if-nez v0, :cond_3

    .line 150
    .line 151
    goto :goto_1

    .line 152
    :cond_3
    if-eqz v0, :cond_4

    .line 153
    .line 154
    if-eq v0, v1, :cond_4

    .line 155
    .line 156
    move v7, v0

    .line 157
    :goto_2
    iget-object v0, p0, La/zii0;->c:La/n0o0;

    .line 158
    .line 159
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    move-object v12, v0

    .line 164
    check-cast v12, Ljava/util/Map;

    .line 165
    .line 166
    iget-object p0, p0, La/zii0;->d:La/n0o0;

    .line 167
    .line 168
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object p0

    .line 172
    move-object v13, p0

    .line 173
    check-cast v13, Ljava/util/Map;

    .line 174
    .line 175
    const/4 v9, 0x0

    .line 176
    const/4 v11, 0x0

    .line 177
    invoke-virtual/range {v6 .. v13}, La/yz9;->a(ILa/xii0;ZLa/sev;Ljava/lang/Integer;Ljava/util/Map;Ljava/util/Map;)La/xz9;

    .line 178
    .line 179
    .line 180
    move-result-object v3

    .line 181
    goto :goto_3

    .line 182
    :cond_4
    new-instance p0, Ljava/lang/StringBuilder;

    .line 183
    .line 184
    const-string v1, "Custom operating mode "

    .line 185
    .line 186
    invoke-direct {p0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    const-string v0, " conflicts with standard modes"

    .line 193
    .line 194
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 195
    .line 196
    .line 197
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object p0

    .line 201
    const-string v0, "CXCP"

    .line 202
    .line 203
    invoke-static {v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 204
    .line 205
    .line 206
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 207
    .line 208
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 209
    .line 210
    .line 211
    const-string p0, "kotlin.Unit"

    .line 212
    .line 213
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    :goto_3
    return-object v3

    .line 217
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
