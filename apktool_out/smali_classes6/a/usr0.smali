.class public final La/usr0;
.super La/iw5;
.source "SourceFile"

# interfaces
.implements La/i620;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "La/usr0;",
        "La/iw5;",
        "La/i620;",
        "<init>",
        "()V",
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
.field public static final synthetic r2:I


# instance fields
.field public k2:La/fiu0;

.field public l2:La/lgn0;

.field public m2:La/ynb;

.field public n2:La/wdk0;

.field public o2:La/ii;

.field public p2:La/wjk;

.field public final q2:La/a8z;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, La/iw5;-><init>()V

    .line 2
    .line 3
    .line 4
    const-class v0, La/ltr0;

    .line 5
    .line 6
    sget-object v1, La/sre0;->a:La/tre0;

    .line 7
    .line 8
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    new-instance v1, La/ssr0;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-direct {v1, p0, v2}, La/ssr0;-><init>(La/usr0;B)V

    .line 16
    .line 17
    .line 18
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iput-object v0, p0, La/usr0;->q2:La/a8z;

    .line 23
    .line 24
    return-void
.end method

.method public static P0(Landroidx/fragment/app/Fragment;)La/e920;
    .locals 1

    .line 1
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 2
    .line 3
    if-eqz p0, :cond_1

    .line 4
    .line 5
    instance-of v0, p0, La/e920;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    check-cast p0, La/e920;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    invoke-static {p0}, La/usr0;->P0(Landroidx/fragment/app/Fragment;)La/e920;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :cond_1
    const-string p0, "MakeBetLoader not found"

    .line 18
    .line 19
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    return-object p0
.end method


# virtual methods
.method public final J0(La/fet;)La/bw5;
    .locals 13

    .line 1
    const v0, 0x4296a48d

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, La/fet;->e0(I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, La/usr0;->Q0()La/k3t0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, La/i3t0;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, La/i3t0;->y(La/fet;)La/pz40;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, La/d820;

    .line 22
    .line 23
    iget-object v1, v0, La/d820;->d:La/zbr;

    .line 24
    .line 25
    new-instance v2, La/bw5;

    .line 26
    .line 27
    const/4 v3, 0x1

    .line 28
    invoke-static {v3, p1}, La/iw5;->O0(ILa/fet;)La/cw5;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    iget-object v0, v0, La/d820;->a:La/ug20;

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    const/4 v12, 0x0

    .line 39
    if-eqz v5, :cond_2

    .line 40
    .line 41
    if-eq v5, v3, :cond_1

    .line 42
    .line 43
    const/4 v3, 0x2

    .line 44
    if-ne v5, v3, :cond_0

    .line 45
    .line 46
    sget-object v3, La/iel;->a:La/iel;

    .line 47
    .line 48
    :goto_0
    move-object v8, v3

    .line 49
    goto :goto_1

    .line 50
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 51
    .line 52
    .line 53
    return-object v12

    .line 54
    :cond_1
    sget-object v3, La/jel;->a:La/jel;

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    sget-object v3, La/kel;->a:La/kel;

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :goto_1
    sget-object v3, La/ug20;->c:La/ug20;

    .line 61
    .line 62
    if-ne v0, v3, :cond_3

    .line 63
    .line 64
    sget-object v5, La/s6t0;->a:La/pz40;

    .line 65
    .line 66
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    iget-object v5, v5, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 71
    .line 72
    invoke-virtual {v5}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackground-0d7_KjU()J

    .line 73
    .line 74
    .line 75
    move-result-wide v5

    .line 76
    :goto_2
    move-wide v9, v5

    .line 77
    goto :goto_3

    .line 78
    :cond_3
    sget-object v5, La/s6t0;->a:La/pz40;

    .line 79
    .line 80
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    iget-object v5, v5, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 85
    .line 86
    invoke-virtual {v5}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 87
    .line 88
    .line 89
    move-result-wide v5

    .line 90
    goto :goto_2

    .line 91
    :goto_3
    const/4 v7, 0x0

    .line 92
    const/4 v11, 0x7

    .line 93
    const/4 v5, 0x0

    .line 94
    const/4 v6, 0x0

    .line 95
    invoke-static/range {v4 .. v11}, La/cw5;->a(La/cw5;ZZZLa/lel;JI)La/cw5;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    const/4 v8, 0x0

    .line 100
    if-ne v0, v3, :cond_4

    .line 101
    .line 102
    if-eqz v1, :cond_4

    .line 103
    .line 104
    const v0, -0x7778582

    .line 105
    .line 106
    .line 107
    invoke-virtual {p1, v0}, La/fet;->e0(I)V

    .line 108
    .line 109
    .line 110
    new-instance v0, La/nhl0;

    .line 111
    .line 112
    const/16 v3, 0x1c

    .line 113
    .line 114
    invoke-direct {v0, v1, p0, v3}, La/nhl0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 115
    .line 116
    .line 117
    const v1, 0x382ee09f

    .line 118
    .line 119
    .line 120
    invoke-static {v1, v0, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 121
    .line 122
    .line 123
    move-result-object v12

    .line 124
    invoke-virtual {p1, v8}, La/fet;->r(Z)V

    .line 125
    .line 126
    .line 127
    :goto_4
    move-object v5, v12

    .line 128
    goto :goto_5

    .line 129
    :cond_4
    const v0, -0x77442cf

    .line 130
    .line 131
    .line 132
    invoke-virtual {p1, v0}, La/fet;->e0(I)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {p1, v8}, La/fet;->r(Z)V

    .line 136
    .line 137
    .line 138
    goto :goto_4

    .line 139
    :goto_5
    new-instance v0, La/gcn0;

    .line 140
    .line 141
    const/16 v1, 0xd

    .line 142
    .line 143
    invoke-direct {v0, p0, v1}, La/gcn0;-><init>(Ljava/lang/Object;B)V

    .line 144
    .line 145
    .line 146
    const p0, 0xd91113e

    .line 147
    .line 148
    .line 149
    invoke-static {p0, v0, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 150
    .line 151
    .line 152
    move-result-object v6

    .line 153
    const/4 v7, 0x6

    .line 154
    move-object v3, v4

    .line 155
    const/4 v4, 0x0

    .line 156
    invoke-direct/range {v2 .. v7}, La/bw5;-><init>(La/cw5;La/xdr;La/ugd;La/ugd;I)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {p1, v8}, La/fet;->r(Z)V

    .line 160
    .line 161
    .line 162
    return-object v2
.end method

.method public final Q0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/usr0;->q2:La/a8z;

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

.method public final V(Landroid/content/Context;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, La/sik;->V(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    instance-of v0, p1, La/wjk;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    check-cast p1, La/wjk;

    .line 9
    .line 10
    iput-object p1, p0, La/usr0;->p2:La/wjk;

    .line 11
    .line 12
    :cond_0
    iget-object p1, p0, La/usr0;->p2:La/wjk;

    .line 13
    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    invoke-static {p1}, La/wjk;->l(La/wjk;)V

    .line 17
    .line 18
    .line 19
    :cond_1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    instance-of v0, p1, La/af3;

    .line 31
    .line 32
    const/4 v1, 0x0

    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    check-cast p1, La/af3;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    move-object p1, v1

    .line 39
    :goto_0
    const-class v0, La/kkr0;

    .line 40
    .line 41
    if-eqz p1, :cond_5

    .line 42
    .line 43
    invoke-interface {p1}, La/af3;->d()La/wcf0;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {p1, v0}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    check-cast p1, La/o5d0;

    .line 52
    .line 53
    if-eqz p1, :cond_3

    .line 54
    .line 55
    invoke-interface {p1}, La/o5d0;->get()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    check-cast p1, La/ze3;

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_3
    move-object p1, v1

    .line 63
    :goto_1
    instance-of v2, p1, La/kkr0;

    .line 64
    .line 65
    if-nez v2, :cond_4

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_4
    move-object v1, p1

    .line 69
    :goto_2
    check-cast v1, La/kkr0;

    .line 70
    .line 71
    if-eqz v1, :cond_5

    .line 72
    .line 73
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-virtual {v1, p1}, La/kkr0;->a(La/i1w0;)La/o9i;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-virtual {p1}, La/o9i;->e()La/fiu0;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    iput-object v0, p0, La/usr0;->k2:La/fiu0;

    .line 86
    .line 87
    iget-object v0, p1, La/o9i;->m:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v0, La/lgn0;

    .line 90
    .line 91
    iput-object v0, p0, La/usr0;->l2:La/lgn0;

    .line 92
    .line 93
    iget-object v0, p1, La/o9i;->l:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v0, La/peg0;

    .line 96
    .line 97
    iget-object v0, v0, La/peg0;->b:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v0, La/yzn0;

    .line 100
    .line 101
    invoke-virtual {v0}, La/yzn0;->i()La/ynb;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-static {v0}, La/x1x;->x(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    iput-object v0, p0, La/usr0;->m2:La/ynb;

    .line 109
    .line 110
    iget-object v0, p1, La/o9i;->B:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v0, La/wdk0;

    .line 113
    .line 114
    iput-object v0, p0, La/usr0;->n2:La/wdk0;

    .line 115
    .line 116
    iget-object p1, p1, La/o9i;->A:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast p1, La/ii;

    .line 119
    .line 120
    iput-object p1, p0, La/usr0;->o2:La/ii;

    .line 121
    .line 122
    return-void

    .line 123
    :cond_5
    const-string p0, "Cannot create dependency "

    .line 124
    .line 125
    invoke-static {v0, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    return-void
.end method

.method public final Y()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 3
    .line 4
    iget-object p0, p0, La/usr0;->p2:La/wjk;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-static {p0}, La/wjk;->l(La/wjk;)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final i0(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1, p2}, La/iw5;->i0(Landroid/view/View;Landroid/os/Bundle;)V

    .line 5
    .line 6
    .line 7
    new-instance p1, La/ssr0;

    .line 8
    .line 9
    const/4 p2, 0x1

    .line 10
    invoke-direct {p1, p0, p2}, La/ssr0;-><init>(La/usr0;B)V

    .line 11
    .line 12
    .line 13
    const-string p2, "REQUEST_INSUFFICIENT_FOUNDS_DIALOG_KEY"

    .line 14
    .line 15
    invoke-static {p0, p2, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method
