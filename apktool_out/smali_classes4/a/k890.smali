.class public final synthetic La/k890;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/o890;


# direct methods
.method public synthetic constructor <init>(La/o890;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/k890;->a:B

    iput-object p1, p0, La/k890;->b:La/o890;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/k890;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, -0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    const/4 v4, 0x0

    .line 7
    iget-object p0, p0, La/k890;->b:La/o890;

    .line 8
    .line 9
    check-cast p1, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    check-cast p2, Landroid/content/Intent;

    .line 19
    .line 20
    sget-object v0, La/o890;->f2:La/jh70;

    .line 21
    .line 22
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    if-ne p1, v2, :cond_5

    .line 26
    .line 27
    invoke-virtual {p0}, La/o890;->L0()La/qm90;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    invoke-static {v0, p2}, La/qm90;->b(Landroid/content/Context;Landroid/content/Intent;)Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    iget-object v0, p0, La/o890;->Z1:Landroid/webkit/ValueCallback;

    .line 43
    .line 44
    if-nez p1, :cond_1

    .line 45
    .line 46
    if-eqz v0, :cond_0

    .line 47
    .line 48
    new-array p1, v4, [Landroid/net/Uri;

    .line 49
    .line 50
    invoke-interface {v0, p1}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    :cond_0
    iput-object v3, p0, La/o890;->Z1:Landroid/webkit/ValueCallback;

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    if-eqz v0, :cond_5

    .line 57
    .line 58
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    if-eqz p1, :cond_2

    .line 67
    .line 68
    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    goto :goto_0

    .line 73
    :cond_2
    move-object p1, v3

    .line 74
    :goto_0
    if-nez p1, :cond_4

    .line 75
    .line 76
    invoke-virtual {p2}, Landroid/content/Intent;->getDataString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    if-nez p1, :cond_3

    .line 81
    .line 82
    const-string p1, ""

    .line 83
    .line 84
    :cond_3
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    filled-new-array {p1}, [Landroid/net/Uri;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    goto :goto_2

    .line 93
    :cond_4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-virtual {p1}, Landroid/content/Intent;->getDataString()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    if-eqz p1, :cond_5

    .line 106
    .line 107
    new-array p2, v1, [Landroid/net/Uri;

    .line 108
    .line 109
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    aput-object p1, p2, v4

    .line 114
    .line 115
    move-object p1, p2

    .line 116
    goto :goto_2

    .line 117
    :cond_5
    :goto_1
    move-object p1, v3

    .line 118
    :goto_2
    iget-object p2, p0, La/o890;->Z1:Landroid/webkit/ValueCallback;

    .line 119
    .line 120
    if-eqz p2, :cond_6

    .line 121
    .line 122
    invoke-interface {p2, p1}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    :cond_6
    iput-object v3, p0, La/o890;->Z1:Landroid/webkit/ValueCallback;

    .line 126
    .line 127
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 128
    .line 129
    return-object p0

    .line 130
    :pswitch_0
    check-cast p2, Ljava/io/File;

    .line 131
    .line 132
    sget-object v0, La/o890;->f2:La/jh70;

    .line 133
    .line 134
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    if-ne p1, v2, :cond_7

    .line 138
    .line 139
    iget-object p1, p0, La/o890;->Z1:Landroid/webkit/ValueCallback;

    .line 140
    .line 141
    if-eqz p1, :cond_7

    .line 142
    .line 143
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    new-instance v2, Ljava/lang/StringBuilder;

    .line 156
    .line 157
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    const-string v0, ".provider"

    .line 164
    .line 165
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    invoke-static {p1, p2, v0}, Landroidx/core/content/FileProvider;->c(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;)Landroid/net/Uri;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    new-array p2, v1, [Landroid/net/Uri;

    .line 180
    .line 181
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    aput-object p1, p2, v4

    .line 190
    .line 191
    goto :goto_3

    .line 192
    :cond_7
    move-object p2, v3

    .line 193
    :goto_3
    iget-object p1, p0, La/o890;->Z1:Landroid/webkit/ValueCallback;

    .line 194
    .line 195
    if-eqz p1, :cond_8

    .line 196
    .line 197
    invoke-interface {p1, p2}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    :cond_8
    iput-object v3, p0, La/o890;->Z1:Landroid/webkit/ValueCallback;

    .line 201
    .line 202
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 203
    .line 204
    return-object p0

    .line 205
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
