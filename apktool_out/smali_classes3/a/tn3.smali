.class public final La/tn3;
.super La/yo8;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/tn3;",
        "La/yo8;",
        "<init>",
        "()V",
        "a/hfk0",
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
.field public static final c2:La/hfk0;

.field public static final synthetic d2:[La/iiy;

.field public static final e2:Ljava/lang/String;


# instance fields
.field public Y1:La/fiu0;

.field public Z1:La/wdk0;

.field public final a2:La/nae0;

.field public final b2:La/kiu0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/tn3;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/app_update/impl/databinding/AppUpdateWhatsNewDialogBinding;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    new-array v2, v2, [La/iiy;

    .line 15
    .line 16
    aput-object v0, v2, v4

    .line 17
    .line 18
    sput-object v2, La/tn3;->d2:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/hfk0;

    .line 21
    .line 22
    const/16 v2, 0x17

    .line 23
    .line 24
    invoke-direct {v0, v2}, La/hfk0;-><init>(B)V

    .line 25
    .line 26
    .line 27
    sput-object v0, La/tn3;->c2:La/hfk0;

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    sput-object v0, La/tn3;->e2:Ljava/lang/String;

    .line 34
    .line 35
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, La/yo8;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, La/sn3;->a:La/sn3;

    .line 5
    .line 6
    invoke-static {p0, v0}, La/ltt0;->p(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/nae0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, La/tn3;->a2:La/nae0;

    .line 11
    .line 12
    new-instance v0, La/a13;

    .line 13
    .line 14
    const/16 v1, 0xc

    .line 15
    .line 16
    invoke-direct {v0, p0, v1}, La/a13;-><init>(Ljava/lang/Object;B)V

    .line 17
    .line 18
    .line 19
    new-instance v1, La/f80;

    .line 20
    .line 21
    const/16 v2, 0x12

    .line 22
    .line 23
    invoke-direct {v1, p0, v2}, La/f80;-><init>(Ljava/lang/Object;B)V

    .line 24
    .line 25
    .line 26
    sget-object v2, La/wez;->b:La/wez;

    .line 27
    .line 28
    new-instance v3, La/f80;

    .line 29
    .line 30
    const/16 v4, 0x13

    .line 31
    .line 32
    invoke-direct {v3, v1, v4}, La/f80;-><init>(Ljava/lang/Object;B)V

    .line 33
    .line 34
    .line 35
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    const-class v2, La/fo3;

    .line 40
    .line 41
    sget-object v3, La/sre0;->a:La/tre0;

    .line 42
    .line 43
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    new-instance v3, La/t51;

    .line 48
    .line 49
    const/16 v4, 0xa

    .line 50
    .line 51
    invoke-direct {v3, v1, v4}, La/t51;-><init>(La/a8z;B)V

    .line 52
    .line 53
    .line 54
    new-instance v4, La/t51;

    .line 55
    .line 56
    const/16 v5, 0xb

    .line 57
    .line 58
    invoke-direct {v4, v1, v5}, La/t51;-><init>(La/a8z;B)V

    .line 59
    .line 60
    .line 61
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    iput-object v0, p0, La/tn3;->b2:La/kiu0;

    .line 66
    .line 67
    return-void
.end method


# virtual methods
.method public final I0()La/un3;
    .locals 2

    .line 1
    sget-object v0, La/tn3;->d2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/tn3;->a2:La/nae0;

    .line 7
    .line 8
    invoke-interface {v1, v0, p0}, La/nae0;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast p0, La/un3;

    .line 16
    .line 17
    return-object p0
.end method

.method public final W(Landroid/os/Bundle;)V
    .locals 10

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    instance-of v1, v0, La/af3;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    check-cast v0, La/af3;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move-object v0, v2

    .line 21
    :goto_0
    const-class v1, La/p9v0;

    .line 22
    .line 23
    if-eqz v0, :cond_3

    .line 24
    .line 25
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0, v1}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, La/o5d0;

    .line 34
    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, La/ze3;

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    move-object v0, v2

    .line 45
    :goto_1
    instance-of v3, v0, La/p9v0;

    .line 46
    .line 47
    if-nez v3, :cond_2

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_2
    move-object v2, v0

    .line 51
    :goto_2
    check-cast v2, La/p9v0;

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    invoke-static {v0}, La/y0x0;->J(Landroid/app/Application;)La/esg0;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    iget-object v4, v2, La/p9v0;->a:La/cad;

    .line 71
    .line 72
    iget-object v6, v2, La/p9v0;->b:La/wdk0;

    .line 73
    .line 74
    iget-object v7, v2, La/p9v0;->c:La/ctf0;

    .line 75
    .line 76
    iget-object v0, v2, La/p9v0;->d:La/fsd;

    .line 77
    .line 78
    iget-object v8, v2, La/p9v0;->e:La/yox;

    .line 79
    .line 80
    iget-object v9, v2, La/p9v0;->f:La/a6u;

    .line 81
    .line 82
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    new-instance v3, La/uii;

    .line 92
    .line 93
    invoke-direct/range {v3 .. v9}, La/uii;-><init>(La/cad;La/esg0;La/wdk0;La/ctf0;La/yox;La/a6u;)V

    .line 94
    .line 95
    .line 96
    new-instance v0, La/fiu0;

    .line 97
    .line 98
    iget-object v1, v3, La/uii;->f:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v1, La/kzi;

    .line 101
    .line 102
    const-class v2, La/fo3;

    .line 103
    .line 104
    invoke-static {v2, v1}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    invoke-direct {v0, v1}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 109
    .line 110
    .line 111
    iput-object v0, p0, La/tn3;->Y1:La/fiu0;

    .line 112
    .line 113
    iput-object v6, p0, La/tn3;->Z1:La/wdk0;

    .line 114
    .line 115
    invoke-super {p0, p1}, La/sik;->W(Landroid/os/Bundle;)V

    .line 116
    .line 117
    .line 118
    return-void

    .line 119
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 120
    .line 121
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    return-void
.end method

.method public final X(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/tn3;->I0()La/un3;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object p0, p0, La/un3;->e:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    return-object p0
.end method

.method public final i0(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 12

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/tn3;->I0()La/un3;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v0, v0, La/un3;->c:Lcom/google/android/material/textview/MaterialTextView;

    .line 9
    .line 10
    new-instance v1, Landroid/text/method/ScrollingMovementMethod;

    .line 11
    .line 12
    invoke-direct {v1}, Landroid/text/method/ScrollingMovementMethod;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, La/tn3;->I0()La/un3;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget-object v0, v0, La/un3;->b:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 23
    .line 24
    new-instance v1, La/rn3;

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    invoke-direct {v1, p0, v3}, La/rn3;-><init>(La/tn3;B)V

    .line 28
    .line 29
    .line 30
    invoke-static {v0, v1}, La/dyb;->c0(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    .line 31
    .line 32
    .line 33
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 34
    .line 35
    const/16 v1, 0x23

    .line 36
    .line 37
    const/4 v8, 0x0

    .line 38
    if-ge v0, v1, :cond_0

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->q0()Landroid/view/View;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    instance-of v1, v0, Landroid/view/View;

    .line 50
    .line 51
    if-eqz v1, :cond_1

    .line 52
    .line 53
    check-cast v0, Landroid/view/View;

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    move-object v0, v8

    .line 57
    :goto_0
    if-eqz v0, :cond_2

    .line 58
    .line 59
    new-instance v1, La/bbw0;

    .line 60
    .line 61
    const/4 v3, 0x6

    .line 62
    invoke-direct {v1, p0, v3}, La/bbw0;-><init>(Ljava/lang/Object;B)V

    .line 63
    .line 64
    .line 65
    sget-object v3, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 66
    .line 67
    invoke-static {v0, v1}, La/igu0;->c(Landroid/view/View;La/zf60;)V

    .line 68
    .line 69
    .line 70
    :cond_2
    :goto_1
    iget-object v9, p0, La/tn3;->b2:La/kiu0;

    .line 71
    .line 72
    invoke-virtual {v9}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    check-cast v0, La/fo3;

    .line 77
    .line 78
    iget-object v1, v0, La/fo3;->g:La/p7m0;

    .line 79
    .line 80
    new-instance v10, La/c00;

    .line 81
    .line 82
    const/16 v3, 0xb

    .line 83
    .line 84
    invoke-direct {v10, v1, v0, v3}, La/c00;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 85
    .line 86
    .line 87
    new-instance v0, La/i8;

    .line 88
    .line 89
    const/4 v6, 0x4

    .line 90
    const/16 v7, 0x1c

    .line 91
    .line 92
    const/4 v1, 0x2

    .line 93
    const-class v3, La/tn3;

    .line 94
    .line 95
    const-string v4, "handleUiState"

    .line 96
    .line 97
    const-string v5, "handleUiState(Lorg/xplatform/app_update/impl/presentation/whats_new/AppUpdateWhatsNewUiModel;)V"

    .line 98
    .line 99
    move-object v2, p0

    .line 100
    invoke-direct/range {v0 .. v7}, La/i8;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 101
    .line 102
    .line 103
    move-object v1, v3

    .line 104
    sget-object v2, La/lkz;->a:La/lkz;

    .line 105
    .line 106
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    invoke-interface {v4}, La/clz;->x()La/glz;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    invoke-static {v2}, La/x0x;->Q(La/glz;)La/tkz;

    .line 115
    .line 116
    .line 117
    move-result-object v11

    .line 118
    new-instance v2, La/tg3;

    .line 119
    .line 120
    const/4 v7, 0x0

    .line 121
    move-object v5, v0

    .line 122
    move-object v6, v8

    .line 123
    move-object v3, v10

    .line 124
    invoke-direct/range {v2 .. v7}, La/tg3;-><init>(La/c00;La/clz;La/i8;La/yje;B)V

    .line 125
    .line 126
    .line 127
    const/4 v10, 0x3

    .line 128
    invoke-static {v11, v8, v8, v2, v10}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v9}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    check-cast v0, La/fo3;

    .line 136
    .line 137
    iget-object v0, v0, La/fo3;->h:La/p7m0;

    .line 138
    .line 139
    new-instance v9, La/lr;

    .line 140
    .line 141
    const/16 v2, 0x12

    .line 142
    .line 143
    invoke-direct {v9, v0, v2}, La/lr;-><init>(La/gmq;B)V

    .line 144
    .line 145
    .line 146
    new-instance v0, La/i8;

    .line 147
    .line 148
    const/4 v6, 0x4

    .line 149
    const/16 v7, 0x1d

    .line 150
    .line 151
    move-object v3, v1

    .line 152
    const/4 v1, 0x2

    .line 153
    const-string v4, "handleEvent"

    .line 154
    .line 155
    const-string v5, "handleEvent(Lorg/xplatform/app_update/impl/presentation/whats_new/AppUpdateWhatsNewEvent;)V"

    .line 156
    .line 157
    move-object v2, p0

    .line 158
    invoke-direct/range {v0 .. v7}, La/i8;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 159
    .line 160
    .line 161
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 162
    .line 163
    .line 164
    move-result-object v4

    .line 165
    invoke-interface {v4}, La/clz;->x()La/glz;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    new-instance v2, La/tg3;

    .line 174
    .line 175
    const/4 v7, 0x0

    .line 176
    move-object v5, v0

    .line 177
    move-object v6, v8

    .line 178
    move-object v3, v9

    .line 179
    invoke-direct/range {v2 .. v7}, La/tg3;-><init>(La/lr;La/clz;La/i8;La/yje;C)V

    .line 180
    .line 181
    .line 182
    invoke-static {v1, v6, v6, v2, v10}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 183
    .line 184
    .line 185
    return-void
.end method
