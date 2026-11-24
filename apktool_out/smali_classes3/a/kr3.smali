.class public final synthetic La/kr3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lorg/xplatform/client1/features/appactivity/ApplicationActivity;


# direct methods
.method public synthetic constructor <init>(Lorg/xplatform/client1/features/appactivity/ApplicationActivity;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/kr3;->a:B

    iput-object p1, p0, La/kr3;->b:Lorg/xplatform/client1/features/appactivity/ApplicationActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/kr3;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/kr3;->b:Lorg/xplatform/client1/features/appactivity/ApplicationActivity;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->h1:La/z7z;

    .line 10
    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    invoke-interface {p0}, La/z7z;->get()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    check-cast p0, La/miu0;

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_0
    const-string p0, "viewModelFactory"

    .line 24
    .line 25
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw v1

    .line 29
    :pswitch_0
    sget v0, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->F1:I

    .line 30
    .line 31
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    new-instance v1, Landroid/content/ComponentName;

    .line 36
    .line 37
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    const-string v3, "org.xplatform.client1.LauncherAliasColor"

    .line 42
    .line 43
    invoke-direct {v1, v2, v3}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const/4 v2, 0x2

    .line 47
    const/4 v3, 0x1

    .line 48
    invoke-virtual {v0, v1, v2, v3}, Landroid/content/pm/PackageManager;->setComponentEnabledSetting(Landroid/content/ComponentName;II)V

    .line 49
    .line 50
    .line 51
    new-instance v1, Landroid/content/ComponentName;

    .line 52
    .line 53
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    const-string v2, "org.xplatform.client1.LauncherAliasLegacy"

    .line 58
    .line 59
    invoke-direct {v1, p0, v2}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, v1, v3, v3}, Landroid/content/pm/PackageManager;->setComponentEnabledSetting(Landroid/content/ComponentName;II)V

    .line 63
    .line 64
    .line 65
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 66
    .line 67
    return-object p0

    .line 68
    :pswitch_1
    iput-object v1, p0, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->C1:La/ndk0;

    .line 69
    .line 70
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 71
    .line 72
    return-object p0

    .line 73
    :pswitch_2
    iput-object v1, p0, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->D1:La/ndk0;

    .line 74
    .line 75
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 76
    .line 77
    return-object p0

    .line 78
    :pswitch_3
    sget v0, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->F1:I

    .line 79
    .line 80
    invoke-virtual {p0}, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->F()La/zu3;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    iget-object p0, p0, La/zu3;->X:La/pmi0;

    .line 85
    .line 86
    sget-object v0, La/ljj;->a:La/ljj;

    .line 87
    .line 88
    invoke-virtual {p0, v0}, La/pmi0;->g(La/ljj;)V

    .line 89
    .line 90
    .line 91
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 92
    .line 93
    return-object p0

    .line 94
    :pswitch_4
    sget v0, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->F1:I

    .line 95
    .line 96
    invoke-virtual {p0}, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->F()La/zu3;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    iget-object v0, p0, La/zu3;->Z:La/p4u;

    .line 101
    .line 102
    iget-object v0, v0, La/p4u;->a:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v0, La/bbw0;

    .line 105
    .line 106
    iget-object v0, v0, La/bbw0;->b:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v0, La/ht2;

    .line 109
    .line 110
    iget-object v0, v0, La/ht2;->a:La/p7m0;

    .line 111
    .line 112
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    move-object v1, v0

    .line 117
    check-cast v1, Ljava/util/List;

    .line 118
    .line 119
    const/4 v5, 0x0

    .line 120
    const/16 v6, 0x3e

    .line 121
    .line 122
    const-string v2, "\n"

    .line 123
    .line 124
    const/4 v3, 0x0

    .line 125
    const/4 v4, 0x0

    .line 126
    invoke-static/range {v1 .. v6}, Lkotlin/collections/CollectionsKt;->b0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    iget-object p0, p0, La/zu3;->h0:La/ol60;

    .line 131
    .line 132
    new-instance v1, La/at3;

    .line 133
    .line 134
    invoke-direct {v1, v0}, La/at3;-><init>(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {p0, v1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 141
    .line 142
    return-object p0

    .line 143
    :pswitch_5
    sget v0, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->F1:I

    .line 144
    .line 145
    invoke-virtual {p0}, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->F()La/zu3;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    iget-object p0, p0, La/zu3;->Y:La/peg0;

    .line 150
    .line 151
    iget-object p0, p0, La/peg0;->b:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast p0, La/bbw0;

    .line 154
    .line 155
    iget-object p0, p0, La/bbw0;->b:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast p0, La/ht2;

    .line 158
    .line 159
    iget-object p0, p0, La/ht2;->a:La/p7m0;

    .line 160
    .line 161
    sget-object v0, La/iun;->a:La/iun;

    .line 162
    .line 163
    invoke-virtual {p0, v0}, La/p7m0;->n(Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 167
    .line 168
    return-object p0

    .line 169
    :pswitch_6
    iput-object v1, p0, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->B1:La/ndk0;

    .line 170
    .line 171
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 172
    .line 173
    return-object p0

    .line 174
    :pswitch_7
    sget v0, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->F1:I

    .line 175
    .line 176
    new-instance v0, La/rs3;

    .line 177
    .line 178
    invoke-virtual {p0}, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->C()La/sn;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    iget-object v2, v2, La/sn;->b:Landroid/widget/FrameLayout;

    .line 183
    .line 184
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    .line 185
    .line 186
    .line 187
    move-result v2

    .line 188
    const/16 v3, 0xc

    .line 189
    .line 190
    invoke-direct {v0, p0, v2, v1, v3}, La/rs3;-><init>(La/kxq;ILandroidx/fragment/app/e;I)V

    .line 191
    .line 192
    .line 193
    return-object v0

    .line 194
    nop

    .line 195
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
