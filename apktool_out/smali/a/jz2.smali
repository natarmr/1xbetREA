.class public final synthetic La/jz2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Landroidx/fragment/app/e;

.field public final synthetic b:La/nzq;

.field public final synthetic c:Landroid/content/Context;

.field public final synthetic d:Ljava/lang/Class;

.field public final synthetic e:La/pz40;

.field public final synthetic f:La/d5r;

.field public final synthetic g:Landroid/os/Bundle;

.field public final synthetic h:I

.field public final synthetic i:La/lkz;


# direct methods
.method public synthetic constructor <init>(Landroidx/fragment/app/e;La/nzq;Landroid/content/Context;Ljava/lang/Class;La/pz40;La/d5r;Landroid/os/Bundle;ILa/lkz;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/jz2;->a:Landroidx/fragment/app/e;

    iput-object p2, p0, La/jz2;->b:La/nzq;

    iput-object p3, p0, La/jz2;->c:Landroid/content/Context;

    iput-object p4, p0, La/jz2;->d:Ljava/lang/Class;

    iput-object p5, p0, La/jz2;->e:La/pz40;

    iput-object p6, p0, La/jz2;->f:La/d5r;

    iput-object p7, p0, La/jz2;->g:Landroid/os/Bundle;

    iput p8, p0, La/jz2;->h:I

    iput-object p9, p0, La/jz2;->i:La/lkz;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    check-cast p1, La/lwk;

    .line 2
    .line 3
    new-instance v4, La/hie0;

    .line 4
    .line 5
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, La/jz2;->b:La/nzq;

    .line 9
    .line 10
    invoke-virtual {p1}, La/nzq;->a()Landroidx/fragment/app/FragmentContainerView;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-object v1, p0, La/jz2;->a:Landroidx/fragment/app/e;

    .line 19
    .line 20
    invoke-virtual {v1, v0}, Landroidx/fragment/app/e;->I(I)Landroidx/fragment/app/Fragment;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget-object v3, p0, La/jz2;->f:La/d5r;

    .line 25
    .line 26
    if-nez v0, :cond_2

    .line 27
    .line 28
    invoke-virtual {v1}, Landroidx/fragment/app/e;->S()La/m1r;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iget-object v2, p0, La/jz2;->c:Landroid/content/Context;

    .line 33
    .line 34
    invoke-virtual {v2}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 35
    .line 36
    .line 37
    iget-object v2, p0, La/jz2;->d:Ljava/lang/Class;

    .line 38
    .line 39
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-virtual {v0, v2}, La/m1r;->a(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    iget-object v2, v3, La/d5r;->a:La/pz40;

    .line 48
    .line 49
    invoke-interface {v2}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    check-cast v2, Landroidx/fragment/app/Fragment$SavedState;

    .line 54
    .line 55
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->t0(Landroidx/fragment/app/Fragment$SavedState;)V

    .line 56
    .line 57
    .line 58
    iget-object v2, p0, La/jz2;->g:Landroid/os/Bundle;

    .line 59
    .line 60
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->s0(Landroid/os/Bundle;)V

    .line 61
    .line 62
    .line 63
    new-instance v2, La/zb5;

    .line 64
    .line 65
    invoke-direct {v2, v1}, La/zb5;-><init>(Landroidx/fragment/app/e;)V

    .line 66
    .line 67
    .line 68
    const/4 v5, 0x1

    .line 69
    iput-boolean v5, v2, La/zb5;->p:Z

    .line 70
    .line 71
    invoke-virtual {p1}, La/nzq;->a()Landroidx/fragment/app/FragmentContainerView;

    .line 72
    .line 73
    .line 74
    move-result-object v6

    .line 75
    iget v7, p0, La/jz2;->h:I

    .line 76
    .line 77
    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v7

    .line 81
    iput-object v6, v0, Landroidx/fragment/app/Fragment;->k1:Landroid/view/ViewGroup;

    .line 82
    .line 83
    iput-boolean v5, v0, Landroidx/fragment/app/Fragment;->r:Z

    .line 84
    .line 85
    invoke-virtual {v6}, Landroid/view/View;->getId()I

    .line 86
    .line 87
    .line 88
    move-result v6

    .line 89
    invoke-virtual {v2, v6, v0, v7, v5}, La/zb5;->k(ILandroidx/fragment/app/Fragment;Ljava/lang/String;I)V

    .line 90
    .line 91
    .line 92
    sget-object v6, La/lkz;->c:La/lkz;

    .line 93
    .line 94
    iget-object v7, p0, La/jz2;->i:La/lkz;

    .line 95
    .line 96
    invoke-virtual {v7, v6}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 97
    .line 98
    .line 99
    move-result v6

    .line 100
    if-ltz v6, :cond_0

    .line 101
    .line 102
    invoke-virtual {v2, v0, v7}, La/zb5;->q(Landroidx/fragment/app/Fragment;La/lkz;)V

    .line 103
    .line 104
    .line 105
    :cond_0
    invoke-virtual {v1}, Landroidx/fragment/app/e;->a0()Z

    .line 106
    .line 107
    .line 108
    move-result v6

    .line 109
    if-eqz v6, :cond_1

    .line 110
    .line 111
    iput-boolean v5, v4, La/hie0;->a:Z

    .line 112
    .line 113
    iget-object v5, v0, Landroidx/fragment/app/Fragment;->u1:La/glz;

    .line 114
    .line 115
    new-instance v6, La/lz2;

    .line 116
    .line 117
    const/4 v7, 0x0

    .line 118
    invoke-direct {v6, v4, v0, v7}, La/lz2;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v5, v6}, La/glz;->a(La/blz;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v2}, La/zb5;->i()V

    .line 125
    .line 126
    .line 127
    goto :goto_0

    .line 128
    :cond_1
    invoke-virtual {v2}, La/zb5;->h()V

    .line 129
    .line 130
    .line 131
    :cond_2
    :goto_0
    move-object v2, v0

    .line 132
    invoke-virtual {p1}, La/nzq;->a()Landroidx/fragment/app/FragmentContainerView;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    invoke-virtual {v1, p1}, Landroidx/fragment/app/e;->d0(Landroidx/fragment/app/FragmentContainerView;)V

    .line 137
    .line 138
    .line 139
    iget-object p0, p0, La/jz2;->e:La/pz40;

    .line 140
    .line 141
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 146
    .line 147
    invoke-interface {p0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    new-instance v0, La/kz2;

    .line 151
    .line 152
    const/4 v5, 0x0

    .line 153
    invoke-direct/range {v0 .. v5}, La/kz2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 154
    .line 155
    .line 156
    return-object v0
.end method
