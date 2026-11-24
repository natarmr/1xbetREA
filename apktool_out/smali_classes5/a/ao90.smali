.class public final La/ao90;
.super La/iw5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/ao90;",
        "La/iw5;",
        "<init>",
        "()V",
        "a/xi70",
        "impl"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final o2:La/xi70;

.field public static final synthetic p2:[La/iiy;


# instance fields
.field public final k2:La/a8z;

.field public final l2:La/a8z;

.field public final m2:La/khf0;

.field public final n2:La/khf0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/ao90;

    .line 4
    .line 5
    const-string v2, "pickerParams"

    .line 6
    .line 7
    const-string v3, "getPickerParams()Lorg/xplatform/picker/api/presentation/PickerParams;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    new-instance v2, La/ez40;

    .line 14
    .line 15
    const-string v3, "analyticsEntryPoint"

    .line 16
    .line 17
    const-string v5, "getAnalyticsEntryPoint()Lorg/xplatform/picker/api/presentation/AnalyticsEntryPoint;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    const/4 v1, 0x2

    .line 23
    new-array v1, v1, [La/iiy;

    .line 24
    .line 25
    aput-object v0, v1, v4

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    aput-object v2, v1, v0

    .line 29
    .line 30
    sput-object v1, La/ao90;->p2:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/xi70;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/ao90;->o2:La/xi70;

    .line 38
    .line 39
    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, La/iw5;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/wn90;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, p0, v1}, La/wn90;-><init>(La/ao90;B)V

    .line 8
    .line 9
    .line 10
    sget-object v1, La/wez;->b:La/wez;

    .line 11
    .line 12
    invoke-static {v1, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iput-object v0, p0, La/ao90;->k2:La/a8z;

    .line 17
    .line 18
    const-class v0, La/no90;

    .line 19
    .line 20
    sget-object v1, La/sre0;->a:La/tre0;

    .line 21
    .line 22
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    new-instance v1, La/wn90;

    .line 27
    .line 28
    const/4 v2, 0x1

    .line 29
    invoke-direct {v1, p0, v2}, La/wn90;-><init>(La/ao90;B)V

    .line 30
    .line 31
    .line 32
    const/16 v2, 0xe

    .line 33
    .line 34
    const/4 v3, 0x0

    .line 35
    invoke-static {p0, v0, v3, v1, v2}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iput-object v0, p0, La/ao90;->l2:La/a8z;

    .line 40
    .line 41
    new-instance v0, La/khf0;

    .line 42
    .line 43
    const-string v1, "KEY_PARAMS"

    .line 44
    .line 45
    invoke-direct {v0, v1}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    iput-object v0, p0, La/ao90;->m2:La/khf0;

    .line 49
    .line 50
    new-instance v0, La/khf0;

    .line 51
    .line 52
    const-string v1, "ANALYTICS_ENTRY_POINT_KEY"

    .line 53
    .line 54
    sget-object v2, Lorg/xplatform/picker/api/presentation/AnalyticsEntryPoint;->b:Lorg/xplatform/picker/api/presentation/AnalyticsEntryPoint;

    .line 55
    .line 56
    invoke-direct {v0, v2, v1}, La/khf0;-><init>(Landroid/os/Parcelable;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    iput-object v0, p0, La/ao90;->n2:La/khf0;

    .line 60
    .line 61
    return-void
.end method


# virtual methods
.method public final J0(La/fet;)La/bw5;
    .locals 12

    .line 1
    const v0, -0x55264017

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, La/fet;->e0(I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1, p0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    sget-object v9, La/ukd;->a:La/cl5;

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    if-ne v1, v9, :cond_1

    .line 20
    .line 21
    :cond_0
    new-instance v1, La/wn90;

    .line 22
    .line 23
    const/4 v0, 0x2

    .line 24
    invoke-direct {v1, p0, v0}, La/wn90;-><init>(La/ao90;B)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    move-object v3, v1

    .line 31
    check-cast v3, Lkotlin/jvm/functions/Function0;

    .line 32
    .line 33
    invoke-virtual {p1, p0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    const/4 v10, 0x3

    .line 42
    if-nez v0, :cond_2

    .line 43
    .line 44
    if-ne v1, v9, :cond_3

    .line 45
    .line 46
    :cond_2
    new-instance v1, La/wn90;

    .line 47
    .line 48
    invoke-direct {v1, p0, v10}, La/wn90;-><init>(La/ao90;B)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    :cond_3
    move-object v4, v1

    .line 55
    check-cast v4, Lkotlin/jvm/functions/Function0;

    .line 56
    .line 57
    const/4 v7, 0x0

    .line 58
    const/4 v8, 0x4

    .line 59
    const/4 v5, 0x0

    .line 60
    move-object v6, p1

    .line 61
    invoke-static/range {v3 .. v8}, La/v3c;->A(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/clz;La/fet;II)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0}, La/ao90;->P0()La/k3t0;

    .line 65
    .line 66
    .line 67
    move-result-object v11

    .line 68
    invoke-virtual {p1, p0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    if-nez v0, :cond_4

    .line 77
    .line 78
    if-ne v1, v9, :cond_5

    .line 79
    .line 80
    :cond_4
    new-instance v0, La/yi90;

    .line 81
    .line 82
    const/4 v6, 0x0

    .line 83
    const/4 v7, 0x2

    .line 84
    const/4 v1, 0x1

    .line 85
    const-class v3, La/ao90;

    .line 86
    .line 87
    const-string v4, "handleSideEffects"

    .line 88
    .line 89
    const-string v5, "handleSideEffects(Lorg/xplatform/picker/impl/presentation/compose/PickerBottomSheetDialogSideEffect;)V"

    .line 90
    .line 91
    move-object v2, p0

    .line 92
    invoke-direct/range {v0 .. v7}, La/yi90;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p1, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    move-object v1, v0

    .line 99
    :cond_5
    check-cast v1, La/jhy;

    .line 100
    .line 101
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 102
    .line 103
    sget-object v0, La/lkz;->a:La/lkz;

    .line 104
    .line 105
    invoke-static {v1, p1}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-virtual {p1, v11}, La/fet;->i(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    invoke-virtual {p1, p0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v3

    .line 117
    or-int/2addr v1, v3

    .line 118
    invoke-virtual {p1, v10}, La/fet;->e(I)Z

    .line 119
    .line 120
    .line 121
    move-result v3

    .line 122
    or-int/2addr v1, v3

    .line 123
    invoke-virtual {p1, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v3

    .line 127
    or-int/2addr v1, v3

    .line 128
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    if-nez v1, :cond_6

    .line 133
    .line 134
    if-ne v3, v9, :cond_7

    .line 135
    .line 136
    :cond_6
    new-instance v3, La/khx;

    .line 137
    .line 138
    const/4 v1, 0x0

    .line 139
    invoke-direct {v3, v11, p0, v0, v1}, La/khx;-><init>(La/k3t0;La/ao90;La/pz40;La/yje;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {p1, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    :cond_7
    check-cast v3, Lkotlin/jvm/functions/Function2;

    .line 146
    .line 147
    invoke-static {p1, p0, v3}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {p0}, La/ao90;->P0()La/k3t0;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    check-cast v0, La/i3t0;

    .line 155
    .line 156
    invoke-virtual {v0, p1}, La/i3t0;->y(La/fet;)La/pz40;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    new-instance v1, La/bw5;

    .line 161
    .line 162
    const/4 v3, 0x1

    .line 163
    invoke-static {v3, p1}, La/iw5;->O0(ILa/fet;)La/cw5;

    .line 164
    .line 165
    .line 166
    move-result-object v4

    .line 167
    new-instance v5, La/xn90;

    .line 168
    .line 169
    const/4 v7, 0x0

    .line 170
    invoke-direct {v5, v0, p0, v7}, La/xn90;-><init>(La/pz40;La/ao90;B)V

    .line 171
    .line 172
    .line 173
    const v6, -0x38067ca8

    .line 174
    .line 175
    .line 176
    invoke-static {v6, v5, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 177
    .line 178
    .line 179
    move-result-object v5

    .line 180
    new-instance v6, La/xn90;

    .line 181
    .line 182
    invoke-direct {v6, v0, p0, v3}, La/xn90;-><init>(La/pz40;La/ao90;B)V

    .line 183
    .line 184
    .line 185
    const v0, 0x30bcc65a

    .line 186
    .line 187
    .line 188
    invoke-static {v0, v6, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    const/16 v6, 0xa

    .line 193
    .line 194
    move-object v2, v4

    .line 195
    const/4 v4, 0x0

    .line 196
    move-object v3, v5

    .line 197
    move-object v5, v0

    .line 198
    invoke-direct/range {v1 .. v6}, La/bw5;-><init>(La/cw5;La/xdr;La/ugd;La/ugd;I)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {p1, v7}, La/fet;->r(Z)V

    .line 202
    .line 203
    .line 204
    return-object v1
.end method

.method public final P0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/ao90;->l2:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/k3t0;

    .line 8
    .line 9
    return-object p0
.end method

.method public final i0(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1, p2}, La/iw5;->i0(Landroid/view/View;Landroid/os/Bundle;)V

    .line 5
    .line 6
    .line 7
    sget-object p2, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/view/View;->isLaidOut()Z

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    if-eqz p2, :cond_0

    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/view/View;->isLayoutRequested()Z

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    if-nez p2, :cond_0

    .line 20
    .line 21
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 22
    .line 23
    new-instance p2, Lkotlin/Pair;

    .line 24
    .line 25
    const-string v0, "PICKER_DIALOG_TAG"

    .line 26
    .line 27
    invoke-direct {p2, v0, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    filled-new-array {p2}, [Lkotlin/Pair;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-static {p1}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-static {p1, p0, v0}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_0
    new-instance p2, La/w23;

    .line 43
    .line 44
    const/16 v0, 0xb

    .line 45
    .line 46
    invoke-direct {p2, p0, v0}, La/w23;-><init>(Ljava/lang/Object;B)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1, p2}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1}, La/sik;->onDismiss(Landroid/content/DialogInterface;)V

    .line 5
    .line 6
    .line 7
    const-string p1, "PICKER_DISMISS_KEY"

    .line 8
    .line 9
    invoke-static {}, La/i120;->U()Landroid/os/Bundle;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0, p0, p1}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
