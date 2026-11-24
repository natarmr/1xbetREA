.class public final La/vof0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "La/vof0;",
        "La/yx5;",
        "<init>",
        "()V",
        "resident"
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
.field public static final synthetic O1:[La/iiy;


# instance fields
.field public final K1:La/i9o0;

.field public L1:La/fiu0;

.field public final M1:La/s0r;

.field public final N1:La/kiu0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/vof0;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/resident/databinding/FragmentResidentBinding;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    new-array v1, v1, [La/iiy;

    .line 15
    .line 16
    aput-object v0, v1, v4

    .line 17
    .line 18
    sput-object v1, La/vof0;->O1:[La/iiy;

    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d02bc

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, La/i9o0;->a:La/i9o0;

    .line 8
    .line 9
    iput-object v0, p0, La/vof0;->K1:La/i9o0;

    .line 10
    .line 11
    sget-object v0, La/rof0;->a:La/rof0;

    .line 12
    .line 13
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, La/vof0;->M1:La/s0r;

    .line 18
    .line 19
    new-instance v0, La/nof0;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-direct {v0, p0, v1}, La/nof0;-><init>(La/vof0;B)V

    .line 23
    .line 24
    .line 25
    new-instance v1, La/lce0;

    .line 26
    .line 27
    const/16 v2, 0x11

    .line 28
    .line 29
    invoke-direct {v1, p0, v2}, La/lce0;-><init>(Ljava/lang/Object;B)V

    .line 30
    .line 31
    .line 32
    sget-object v2, La/wez;->b:La/wez;

    .line 33
    .line 34
    new-instance v3, La/lce0;

    .line 35
    .line 36
    const/16 v4, 0x12

    .line 37
    .line 38
    invoke-direct {v3, v1, v4}, La/lce0;-><init>(Ljava/lang/Object;B)V

    .line 39
    .line 40
    .line 41
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    const-class v2, La/aqf0;

    .line 46
    .line 47
    sget-object v3, La/sre0;->a:La/tre0;

    .line 48
    .line 49
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    new-instance v3, La/wbe0;

    .line 54
    .line 55
    invoke-direct {v3, v1, v4}, La/wbe0;-><init>(La/a8z;B)V

    .line 56
    .line 57
    .line 58
    new-instance v4, La/wbe0;

    .line 59
    .line 60
    const/16 v5, 0x13

    .line 61
    .line 62
    invoke-direct {v4, v1, v5}, La/wbe0;-><init>(La/a8z;B)V

    .line 63
    .line 64
    .line 65
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    iput-object v0, p0, La/vof0;->N1:La/kiu0;

    .line 70
    .line 71
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, La/vof0;->H0()La/e4r;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p1, p1, La/e4r;->e:Lorg/xplatform/resident/presentation/views/ResidentSafeLineView;

    .line 6
    .line 7
    new-instance v0, La/oof0;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {v0, p0, v1}, La/oof0;-><init>(La/vof0;B)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, v0}, Lorg/xplatform/resident/presentation/views/ResidentSafeLineView;->setOnSafeClickListener(Lkotlin/jvm/functions/Function1;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, La/vof0;->H0()La/e4r;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iget-object p1, p1, La/e4r;->c:Lorg/xplatform/resident/presentation/views/ResidentDoorLineView;

    .line 21
    .line 22
    new-instance v0, La/oof0;

    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    invoke-direct {v0, p0, v1}, La/oof0;-><init>(La/vof0;B)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, v0}, Lorg/xplatform/resident/presentation/views/ResidentDoorLineView;->setOnDoorClickListener(Lkotlin/jvm/functions/Function1;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, La/vof0;->H0()La/e4r;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iget-object p1, p1, La/e4r;->b:Landroidx/appcompat/widget/AppCompatButton;

    .line 36
    .line 37
    sget-object v0, La/ymx;->f:La/ymx;

    .line 38
    .line 39
    new-instance v1, La/oof0;

    .line 40
    .line 41
    const/4 v2, 0x2

    .line 42
    invoke-direct {v1, p0, v2}, La/oof0;-><init>(La/vof0;B)V

    .line 43
    .line 44
    .line 45
    invoke-static {p1, v0, v1}, La/dyb;->b0(Landroid/view/View;La/ymx;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public final C0()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 2
    .line 3
    instance-of v1, v0, La/kqf0;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, La/kqf0;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object v0, v0, La/kqf0;->W1:La/n0o0;

    .line 14
    .line 15
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, La/wri;

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    new-instance v1, La/fiu0;

    .line 24
    .line 25
    const-class v2, La/aqf0;

    .line 26
    .line 27
    iget-object v0, v0, La/wri;->p0:La/omi;

    .line 28
    .line 29
    invoke-static {v2, v0}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-direct {v1, v0}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 34
    .line 35
    .line 36
    iput-object v1, p0, La/vof0;->L1:La/fiu0;

    .line 37
    .line 38
    :cond_1
    return-void
.end method

.method public final D0()V
    .locals 9

    .line 1
    invoke-virtual {p0}, La/vof0;->I0()La/aqf0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/aqf0;->C:La/p7m0;

    .line 6
    .line 7
    new-instance v1, La/sof0;

    .line 8
    .line 9
    const/4 v6, 0x0

    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-direct {v1, p0, v6, v2}, La/sof0;-><init>(La/vof0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    sget-object v3, La/lkz;->a:La/lkz;

    .line 15
    .line 16
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-interface {v3}, La/clz;->x()La/glz;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    invoke-static {v4}, La/x0x;->Q(La/glz;)La/tkz;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    new-instance v5, La/w7f0;

    .line 29
    .line 30
    invoke-direct {v5, v0, v3, v1, v6}, La/w7f0;-><init>(La/gmq;La/clz;La/sof0;La/yje;)V

    .line 31
    .line 32
    .line 33
    const/4 v0, 0x3

    .line 34
    invoke-static {v4, v6, v6, v5, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, La/vof0;->I0()La/aqf0;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    iget-object v1, v1, La/aqf0;->D:La/p7m0;

    .line 42
    .line 43
    new-instance v3, La/tof0;

    .line 44
    .line 45
    invoke-direct {v3, p0, v6, v2}, La/tof0;-><init>(La/vof0;La/yje;B)V

    .line 46
    .line 47
    .line 48
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-interface {v2}, La/clz;->x()La/glz;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    invoke-static {v4}, La/x0x;->Q(La/glz;)La/tkz;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    new-instance v5, La/w7f0;

    .line 61
    .line 62
    invoke-direct {v5, v1, v2, v3, v6}, La/w7f0;-><init>(La/gmq;La/clz;La/tof0;La/yje;)V

    .line 63
    .line 64
    .line 65
    invoke-static {v4, v6, v6, v5, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0}, La/vof0;->I0()La/aqf0;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    iget-object v3, v1, La/aqf0;->E:La/p7m0;

    .line 73
    .line 74
    new-instance v5, La/sof0;

    .line 75
    .line 76
    const/4 v1, 0x1

    .line 77
    invoke-direct {v5, p0, v6, v1}, La/sof0;-><init>(La/vof0;La/yje;B)V

    .line 78
    .line 79
    .line 80
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    invoke-interface {v4}, La/clz;->x()La/glz;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    invoke-static {v2}, La/x0x;->Q(La/glz;)La/tkz;

    .line 89
    .line 90
    .line 91
    move-result-object v8

    .line 92
    new-instance v2, La/w7f0;

    .line 93
    .line 94
    const/4 v7, 0x0

    .line 95
    invoke-direct/range {v2 .. v7}, La/w7f0;-><init>(La/gmq;La/clz;La/sof0;La/yje;B)V

    .line 96
    .line 97
    .line 98
    invoke-static {v8, v6, v6, v2, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0}, La/vof0;->I0()La/aqf0;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    iget-object v3, v2, La/aqf0;->F:La/p7m0;

    .line 106
    .line 107
    new-instance v5, La/sof0;

    .line 108
    .line 109
    const/4 v2, 0x2

    .line 110
    invoke-direct {v5, p0, v6, v2}, La/sof0;-><init>(La/vof0;La/yje;B)V

    .line 111
    .line 112
    .line 113
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 114
    .line 115
    .line 116
    move-result-object v4

    .line 117
    invoke-interface {v4}, La/clz;->x()La/glz;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    invoke-static {v2}, La/x0x;->Q(La/glz;)La/tkz;

    .line 122
    .line 123
    .line 124
    move-result-object v8

    .line 125
    new-instance v2, La/w7f0;

    .line 126
    .line 127
    invoke-direct/range {v2 .. v7}, La/w7f0;-><init>(La/gmq;La/clz;La/sof0;La/yje;C)V

    .line 128
    .line 129
    .line 130
    invoke-static {v8, v6, v6, v2, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 131
    .line 132
    .line 133
    invoke-virtual {p0}, La/vof0;->I0()La/aqf0;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    iget-object v3, v2, La/aqf0;->G:La/p7m0;

    .line 138
    .line 139
    new-instance v5, La/tof0;

    .line 140
    .line 141
    invoke-direct {v5, p0, v6, v1}, La/tof0;-><init>(La/vof0;La/yje;B)V

    .line 142
    .line 143
    .line 144
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 145
    .line 146
    .line 147
    move-result-object v4

    .line 148
    invoke-interface {v4}, La/clz;->x()La/glz;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    invoke-static {p0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    new-instance v2, La/w7f0;

    .line 157
    .line 158
    invoke-direct/range {v2 .. v7}, La/w7f0;-><init>(La/gmq;La/clz;La/tof0;La/yje;B)V

    .line 159
    .line 160
    .line 161
    invoke-static {p0, v6, v6, v2, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 162
    .line 163
    .line 164
    return-void
.end method

.method public final G0()V
    .locals 4

    .line 1
    invoke-virtual {p0}, La/vof0;->H0()La/e4r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/e4r;->i:Landroid/widget/TextView;

    .line 6
    .line 7
    const/16 v1, 0x8

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, La/vof0;->H0()La/e4r;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget-object v0, v0, La/e4r;->f:Lorg/xplatform/resident/presentation/views/ResidentSmokeView;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, La/vof0;->H0()La/e4r;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iget-object v0, v0, La/e4r;->d:Lorg/xplatform/resident/presentation/views/ResidentPersonView;

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, La/vof0;->H0()La/e4r;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iget-object v0, v0, La/e4r;->d:Lorg/xplatform/resident/presentation/views/ResidentPersonView;

    .line 36
    .line 37
    sget-object v3, La/wqf0;->a:La/wqf0;

    .line 38
    .line 39
    invoke-virtual {v0, v3}, Lorg/xplatform/resident/presentation/views/ResidentPersonView;->setState(La/wqf0;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, La/vof0;->H0()La/e4r;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iget-object v0, v0, La/e4r;->e:Lorg/xplatform/resident/presentation/views/ResidentSafeLineView;

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, La/vof0;->H0()La/e4r;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    iget-object v0, v0, La/e4r;->c:Lorg/xplatform/resident/presentation/views/ResidentDoorLineView;

    .line 56
    .line 57
    invoke-virtual {v0}, Lorg/xplatform/resident/presentation/views/ResidentDoorLineView;->a()V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, La/vof0;->H0()La/e4r;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iget-object v0, v0, La/e4r;->c:Lorg/xplatform/resident/presentation/views/ResidentDoorLineView;

    .line 65
    .line 66
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0}, La/vof0;->I0()La/aqf0;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    invoke-virtual {p0}, La/aqf0;->C()V

    .line 74
    .line 75
    .line 76
    return-void
.end method

.method public final H0()La/e4r;
    .locals 2

    .line 1
    sget-object v0, La/vof0;->O1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/vof0;->M1:La/s0r;

    .line 7
    .line 8
    invoke-virtual {v1, v0, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast p0, La/e4r;

    .line 16
    .line 17
    return-object p0
.end method

.method public final I0()La/aqf0;
    .locals 0

    .line 1
    iget-object p0, p0, La/vof0;->N1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/aqf0;

    .line 8
    .line 9
    return-object p0
.end method

.method public final J0(IZ)V
    .locals 3

    .line 1
    invoke-virtual {p0}, La/vof0;->H0()La/e4r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/e4r;->c:Lorg/xplatform/resident/presentation/views/ResidentDoorLineView;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, La/vof0;->H0()La/e4r;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v0, v0, La/e4r;->c:Lorg/xplatform/resident/presentation/views/ResidentDoorLineView;

    .line 16
    .line 17
    new-instance v1, La/nof0;

    .line 18
    .line 19
    const/4 v2, 0x2

    .line 20
    invoke-direct {v1, p0, v2}, La/nof0;-><init>(La/vof0;B)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Lorg/xplatform/resident/presentation/views/ResidentDoorLineView;->setStateAppliedListener(Lkotlin/jvm/functions/Function0;)V

    .line 24
    .line 25
    .line 26
    if-eqz p2, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0}, La/vof0;->H0()La/e4r;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    iget-object p2, p2, La/e4r;->c:Lorg/xplatform/resident/presentation/views/ResidentDoorLineView;

    .line 33
    .line 34
    iget-object v0, p2, Lorg/xplatform/resident/presentation/views/ResidentDoorLineView;->a:Ljava/util/ArrayList;

    .line 35
    .line 36
    if-ltz p1, :cond_0

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-ge p1, v1, :cond_0

    .line 43
    .line 44
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    check-cast p1, La/mof0;

    .line 49
    .line 50
    iget-object v0, p2, Lorg/xplatform/resident/presentation/views/ResidentDoorLineView;->c:Lkotlin/jvm/functions/Function0;

    .line 51
    .line 52
    invoke-virtual {p1, v0}, La/mof0;->setOnDoorAppliedListener(Lkotlin/jvm/functions/Function0;)V

    .line 53
    .line 54
    .line 55
    sget-object v0, La/lof0;->b:La/lof0;

    .line 56
    .line 57
    iget-boolean p2, p2, Lorg/xplatform/resident/presentation/views/ResidentDoorLineView;->d:Z

    .line 58
    .line 59
    invoke-virtual {p1, v0, p2}, La/mof0;->a(La/lof0;Z)V

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_0
    iget-object p1, p2, Lorg/xplatform/resident/presentation/views/ResidentDoorLineView;->c:Lkotlin/jvm/functions/Function0;

    .line 64
    .line 65
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_1
    invoke-virtual {p0}, La/vof0;->H0()La/e4r;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    iget-object p2, p2, La/e4r;->c:Lorg/xplatform/resident/presentation/views/ResidentDoorLineView;

    .line 74
    .line 75
    iget-object v0, p2, Lorg/xplatform/resident/presentation/views/ResidentDoorLineView;->a:Ljava/util/ArrayList;

    .line 76
    .line 77
    if-ltz p1, :cond_2

    .line 78
    .line 79
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    if-ge p1, v1, :cond_2

    .line 84
    .line 85
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    check-cast p1, La/mof0;

    .line 90
    .line 91
    iget-object v0, p2, Lorg/xplatform/resident/presentation/views/ResidentDoorLineView;->c:Lkotlin/jvm/functions/Function0;

    .line 92
    .line 93
    invoke-virtual {p1, v0}, La/mof0;->setOnDoorAppliedListener(Lkotlin/jvm/functions/Function0;)V

    .line 94
    .line 95
    .line 96
    sget-object v0, La/lof0;->a:La/lof0;

    .line 97
    .line 98
    iget-boolean p2, p2, Lorg/xplatform/resident/presentation/views/ResidentDoorLineView;->d:Z

    .line 99
    .line 100
    invoke-virtual {p1, v0, p2}, La/mof0;->a(La/lof0;Z)V

    .line 101
    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_2
    iget-object p1, p2, Lorg/xplatform/resident/presentation/views/ResidentDoorLineView;->c:Lkotlin/jvm/functions/Function0;

    .line 105
    .line 106
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    :goto_0
    invoke-virtual {p0}, La/vof0;->H0()La/e4r;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    iget-object p0, p0, La/e4r;->e:Lorg/xplatform/resident/presentation/views/ResidentSafeLineView;

    .line 114
    .line 115
    const/16 p1, 0x8

    .line 116
    .line 117
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 118
    .line 119
    .line 120
    return-void
.end method

.method public final K0(Ljava/util/ArrayList;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, La/vof0;->H0()La/e4r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/e4r;->e:Lorg/xplatform/resident/presentation/views/ResidentSafeLineView;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, La/vof0;->H0()La/e4r;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v0, v0, La/e4r;->e:Lorg/xplatform/resident/presentation/views/ResidentSafeLineView;

    .line 16
    .line 17
    new-instance v1, La/oof0;

    .line 18
    .line 19
    const/4 v2, 0x3

    .line 20
    invoke-direct {v1, p0, v2}, La/oof0;-><init>(La/vof0;B)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Lorg/xplatform/resident/presentation/views/ResidentSafeLineView;->setOnSafeAppliedListener(Lkotlin/jvm/functions/Function1;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, La/vof0;->H0()La/e4r;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iget-object v0, v0, La/e4r;->e:Lorg/xplatform/resident/presentation/views/ResidentSafeLineView;

    .line 31
    .line 32
    invoke-virtual {v0, p1}, Lorg/xplatform/resident/presentation/views/ResidentSafeLineView;->setSafesState(Ljava/util/List;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, La/vof0;->H0()La/e4r;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    iget-object p0, p0, La/e4r;->c:Lorg/xplatform/resident/presentation/views/ResidentDoorLineView;

    .line 40
    .line 41
    const/16 p1, 0x8

    .line 42
    .line 43
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public final L0(Ljava/util/ArrayList;ZLa/mrf0;Lkotlin/jvm/functions/Function0;La/zje;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    move-object/from16 v2, p5

    .line 6
    .line 7
    instance-of v3, v2, La/uof0;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, v2

    .line 12
    check-cast v3, La/uof0;

    .line 13
    .line 14
    iget v4, v3, La/uof0;->l:I

    .line 15
    .line 16
    const/high16 v5, -0x80000000

    .line 17
    .line 18
    and-int v6, v4, v5

    .line 19
    .line 20
    if-eqz v6, :cond_0

    .line 21
    .line 22
    sub-int/2addr v4, v5

    .line 23
    iput v4, v3, La/uof0;->l:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v3, La/uof0;

    .line 27
    .line 28
    invoke-direct {v3, v0, v2}, La/uof0;-><init>(La/vof0;La/zje;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v2, v3, La/uof0;->j:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v4, La/wne;->a:La/wne;

    .line 34
    .line 35
    iget v5, v3, La/uof0;->l:I

    .line 36
    .line 37
    const/4 v6, 0x0

    .line 38
    const/4 v7, 0x1

    .line 39
    const/4 v8, 0x0

    .line 40
    if-eqz v5, :cond_2

    .line 41
    .line 42
    if-ne v5, v7, :cond_1

    .line 43
    .line 44
    iget-object v1, v3, La/uof0;->i:La/rer;

    .line 45
    .line 46
    check-cast v1, Lkotlin/jvm/functions/Function0;

    .line 47
    .line 48
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 53
    .line 54
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    return-object v8

    .line 58
    :cond_2
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    invoke-static/range {p1 .. p1}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    check-cast v2, La/mrf0;

    .line 66
    .line 67
    iget-object v5, v1, La/mrf0;->d:La/qrf0;

    .line 68
    .line 69
    sget-object v9, La/qrf0;->f:La/qrf0;

    .line 70
    .line 71
    if-ne v5, v9, :cond_3

    .line 72
    .line 73
    move v5, v7

    .line 74
    goto :goto_1

    .line 75
    :cond_3
    move v5, v6

    .line 76
    :goto_1
    if-eqz p2, :cond_7

    .line 77
    .line 78
    if-eqz v2, :cond_7

    .line 79
    .line 80
    iget v1, v1, La/mrf0;->c:I

    .line 81
    .line 82
    iget v2, v2, La/mrf0;->c:I

    .line 83
    .line 84
    if-ne v1, v2, :cond_7

    .line 85
    .line 86
    if-nez v5, :cond_7

    .line 87
    .line 88
    move-object/from16 v1, p4

    .line 89
    .line 90
    check-cast v1, La/rer;

    .line 91
    .line 92
    iput-object v1, v3, La/uof0;->i:La/rer;

    .line 93
    .line 94
    iput v7, v3, La/uof0;->l:I

    .line 95
    .line 96
    const-wide/16 v1, 0x3e8

    .line 97
    .line 98
    invoke-static {v1, v2, v3}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    if-ne v1, v4, :cond_4

    .line 103
    .line 104
    return-object v4

    .line 105
    :cond_4
    move-object/from16 v1, p4

    .line 106
    .line 107
    :goto_2
    invoke-virtual {v0}, La/vof0;->H0()La/e4r;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    iget-object v2, v2, La/e4r;->d:Lorg/xplatform/resident/presentation/views/ResidentPersonView;

    .line 112
    .line 113
    invoke-virtual {v2, v6}, Landroid/view/View;->setVisibility(I)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0}, La/vof0;->H0()La/e4r;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    iget-object v2, v2, La/e4r;->d:Lorg/xplatform/resident/presentation/views/ResidentPersonView;

    .line 121
    .line 122
    sget-object v3, La/wqf0;->e:La/wqf0;

    .line 123
    .line 124
    invoke-virtual {v2, v3}, Lorg/xplatform/resident/presentation/views/ResidentPersonView;->setState(La/wqf0;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0}, La/vof0;->H0()La/e4r;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    iget-object v2, v2, La/e4r;->f:Lorg/xplatform/resident/presentation/views/ResidentSmokeView;

    .line 132
    .line 133
    new-instance v3, La/nof0;

    .line 134
    .line 135
    invoke-direct {v3, v0, v7}, La/nof0;-><init>(La/vof0;B)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v2, v3}, Lorg/xplatform/resident/presentation/views/ResidentSmokeView;->setMaxSmokeShowListener(Lkotlin/jvm/functions/Function0;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v0}, La/vof0;->H0()La/e4r;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    iget-object v2, v2, La/e4r;->f:Lorg/xplatform/resident/presentation/views/ResidentSmokeView;

    .line 146
    .line 147
    new-instance v9, La/b0c0;

    .line 148
    .line 149
    invoke-virtual {v0}, La/vof0;->I0()La/aqf0;

    .line 150
    .line 151
    .line 152
    move-result-object v11

    .line 153
    const/4 v15, 0x0

    .line 154
    const/16 v16, 0x14

    .line 155
    .line 156
    const/4 v10, 0x0

    .line 157
    const-class v12, La/aqf0;

    .line 158
    .line 159
    const-string v13, "onSecondLifeStart"

    .line 160
    .line 161
    const-string v14, "onSecondLifeStart()V"

    .line 162
    .line 163
    invoke-direct/range {v9 .. v16}, La/b0c0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v2, v9}, Lorg/xplatform/resident/presentation/views/ResidentSmokeView;->setSmokeStartedListener(Lkotlin/jvm/functions/Function0;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v0}, La/vof0;->H0()La/e4r;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    iget-object v2, v2, La/e4r;->f:Lorg/xplatform/resident/presentation/views/ResidentSmokeView;

    .line 174
    .line 175
    new-instance v3, La/gvb0;

    .line 176
    .line 177
    const/16 v4, 0x18

    .line 178
    .line 179
    invoke-direct {v3, v1, v0, v4}, La/gvb0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v2, v3}, Lorg/xplatform/resident/presentation/views/ResidentSmokeView;->setSmokeFinishedListener(Lkotlin/jvm/functions/Function0;)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v0}, La/vof0;->H0()La/e4r;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    iget-object v0, v0, La/e4r;->f:Lorg/xplatform/resident/presentation/views/ResidentSmokeView;

    .line 190
    .line 191
    iget-object v1, v0, Lorg/xplatform/resident/presentation/views/ResidentSmokeView;->a:La/sje;

    .line 192
    .line 193
    iget-object v2, v0, Lorg/xplatform/resident/presentation/views/ResidentSmokeView;->b:Landroid/widget/ImageView;

    .line 194
    .line 195
    invoke-virtual {v2}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 196
    .line 197
    .line 198
    move-result-object v3

    .line 199
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 200
    .line 201
    .line 202
    check-cast v3, Landroid/graphics/drawable/AnimationDrawable;

    .line 203
    .line 204
    invoke-virtual {v3}, Landroid/graphics/drawable/AnimationDrawable;->getNumberOfFrames()I

    .line 205
    .line 206
    .line 207
    move-result v4

    .line 208
    invoke-static {v6, v4}, La/l1e0;->o(II)Lkotlin/ranges/IntRange;

    .line 209
    .line 210
    .line 211
    move-result-object v4

    .line 212
    invoke-virtual {v4}, Lkotlin/ranges/a;->iterator()Ljava/util/Iterator;

    .line 213
    .line 214
    .line 215
    move-result-object v4

    .line 216
    move v5, v6

    .line 217
    :goto_3
    move-object v7, v4

    .line 218
    check-cast v7, La/kkx;

    .line 219
    .line 220
    iget-boolean v7, v7, La/kkx;->c:Z

    .line 221
    .line 222
    if-eqz v7, :cond_5

    .line 223
    .line 224
    move-object v7, v4

    .line 225
    check-cast v7, La/bkx;

    .line 226
    .line 227
    invoke-virtual {v7}, La/bkx;->nextInt()I

    .line 228
    .line 229
    .line 230
    move-result v7

    .line 231
    invoke-virtual {v3, v7}, Landroid/graphics/drawable/AnimationDrawable;->getDuration(I)I

    .line 232
    .line 233
    .line 234
    move-result v7

    .line 235
    add-int/2addr v5, v7

    .line 236
    goto :goto_3

    .line 237
    :cond_5
    int-to-long v3, v5

    .line 238
    invoke-virtual {v2}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 239
    .line 240
    .line 241
    move-result-object v5

    .line 242
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 243
    .line 244
    .line 245
    check-cast v5, Landroid/graphics/drawable/AnimationDrawable;

    .line 246
    .line 247
    const/4 v7, 0x2

    .line 248
    invoke-static {v6, v7}, La/l1e0;->o(II)Lkotlin/ranges/IntRange;

    .line 249
    .line 250
    .line 251
    move-result-object v7

    .line 252
    invoke-virtual {v7}, Lkotlin/ranges/a;->iterator()Ljava/util/Iterator;

    .line 253
    .line 254
    .line 255
    move-result-object v7

    .line 256
    move v9, v6

    .line 257
    :goto_4
    move-object v10, v7

    .line 258
    check-cast v10, La/kkx;

    .line 259
    .line 260
    iget-boolean v10, v10, La/kkx;->c:Z

    .line 261
    .line 262
    if-eqz v10, :cond_6

    .line 263
    .line 264
    move-object v10, v7

    .line 265
    check-cast v10, La/bkx;

    .line 266
    .line 267
    invoke-virtual {v10}, La/bkx;->nextInt()I

    .line 268
    .line 269
    .line 270
    move-result v10

    .line 271
    invoke-virtual {v5, v10}, Landroid/graphics/drawable/AnimationDrawable;->getDuration(I)I

    .line 272
    .line 273
    .line 274
    move-result v10

    .line 275
    add-int/2addr v9, v10

    .line 276
    goto :goto_4

    .line 277
    :cond_6
    int-to-long v9, v9

    .line 278
    new-instance v5, La/xrf0;

    .line 279
    .line 280
    invoke-direct {v5, v0, v3, v4, v8}, La/xrf0;-><init>(Lorg/xplatform/resident/presentation/views/ResidentSmokeView;JLa/yje;)V

    .line 281
    .line 282
    .line 283
    const/4 v3, 0x3

    .line 284
    invoke-static {v1, v8, v8, v5, v3}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 285
    .line 286
    .line 287
    new-instance v4, La/xrf0;

    .line 288
    .line 289
    invoke-direct {v4, v9, v10, v0, v8}, La/xrf0;-><init>(JLorg/xplatform/resident/presentation/views/ResidentSmokeView;La/yje;)V

    .line 290
    .line 291
    .line 292
    invoke-static {v1, v8, v8, v4, v3}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 293
    .line 294
    .line 295
    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    .line 296
    .line 297
    .line 298
    invoke-virtual {v2}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 299
    .line 300
    .line 301
    move-result-object v0

    .line 302
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 303
    .line 304
    .line 305
    check-cast v0, Landroid/graphics/drawable/AnimationDrawable;

    .line 306
    .line 307
    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    .line 308
    .line 309
    .line 310
    goto :goto_5

    .line 311
    :cond_7
    invoke-interface/range {p4 .. p4}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 315
    .line 316
    return-object v0
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/vof0;->K1:La/i9o0;

    .line 2
    .line 3
    return-object p0
.end method
