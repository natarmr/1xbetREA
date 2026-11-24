.class public final synthetic La/gpg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/d9z;

.field public final synthetic b:La/l7m0;

.field public final synthetic c:Z

.field public final synthetic d:La/i3m;

.field public final synthetic e:Z

.field public final synthetic f:La/l7m0;

.field public final synthetic g:La/sek;

.field public final synthetic h:La/bek;

.field public final synthetic i:La/z5s;

.field public final synthetic j:Lkotlin/jvm/functions/Function1;

.field public final synthetic k:Z

.field public final synthetic l:La/mm40;

.field public final synthetic m:La/ugd;

.field public final synthetic n:La/l7m0;

.field public final synthetic o:La/l7m0;


# direct methods
.method public synthetic constructor <init>(La/d9z;La/l7m0;ZLa/i3m;ZLa/l7m0;La/sek;La/bek;La/z5s;Lkotlin/jvm/functions/Function1;ZLa/mm40;La/ugd;La/l7m0;La/l7m0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/gpg;->a:La/d9z;

    iput-object p2, p0, La/gpg;->b:La/l7m0;

    iput-boolean p3, p0, La/gpg;->c:Z

    iput-object p4, p0, La/gpg;->d:La/i3m;

    iput-boolean p5, p0, La/gpg;->e:Z

    iput-object p6, p0, La/gpg;->f:La/l7m0;

    iput-object p7, p0, La/gpg;->g:La/sek;

    iput-object p8, p0, La/gpg;->h:La/bek;

    iput-object p9, p0, La/gpg;->i:La/z5s;

    iput-object p10, p0, La/gpg;->j:Lkotlin/jvm/functions/Function1;

    iput-boolean p11, p0, La/gpg;->k:Z

    iput-object p12, p0, La/gpg;->l:La/mm40;

    iput-object p13, p0, La/gpg;->m:La/ugd;

    iput-object p14, p0, La/gpg;->n:La/l7m0;

    iput-object p15, p0, La/gpg;->o:La/l7m0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v5, p1

    .line 4
    .line 5
    check-cast v5, La/fet;

    .line 6
    .line 7
    move-object/from16 v1, p2

    .line 8
    .line 9
    check-cast v1, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    and-int/lit8 v2, v1, 0x3

    .line 16
    .line 17
    const/4 v3, 0x2

    .line 18
    const/4 v4, 0x0

    .line 19
    const/4 v6, 0x1

    .line 20
    if-eq v2, v3, :cond_0

    .line 21
    .line 22
    move v2, v6

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v2, v4

    .line 25
    :goto_0
    and-int/2addr v1, v6

    .line 26
    invoke-virtual {v5, v1, v2}, La/fet;->U(IZ)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_3

    .line 31
    .line 32
    iget-boolean v13, v0, La/gpg;->c:Z

    .line 33
    .line 34
    invoke-virtual {v5, v13}, La/fet;->h(Z)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    invoke-virtual {v5}, La/fet;->P()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    if-nez v1, :cond_1

    .line 43
    .line 44
    sget-object v1, La/ukd;->a:La/cl5;

    .line 45
    .line 46
    if-ne v2, v1, :cond_2

    .line 47
    .line 48
    :cond_1
    new-instance v2, La/cpg;

    .line 49
    .line 50
    invoke-direct {v2, v4, v13}, La/cpg;-><init>(BZ)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v5, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    :cond_2
    move-object v3, v2

    .line 57
    check-cast v3, La/xdr;

    .line 58
    .line 59
    new-instance v6, La/dpg;

    .line 60
    .line 61
    iget-object v7, v0, La/gpg;->d:La/i3m;

    .line 62
    .line 63
    iget-boolean v8, v0, La/gpg;->e:Z

    .line 64
    .line 65
    iget-object v9, v0, La/gpg;->f:La/l7m0;

    .line 66
    .line 67
    iget-object v10, v0, La/gpg;->g:La/sek;

    .line 68
    .line 69
    iget-object v11, v0, La/gpg;->h:La/bek;

    .line 70
    .line 71
    iget-object v12, v0, La/gpg;->i:La/z5s;

    .line 72
    .line 73
    iget-object v14, v0, La/gpg;->j:Lkotlin/jvm/functions/Function1;

    .line 74
    .line 75
    iget-boolean v15, v0, La/gpg;->k:Z

    .line 76
    .line 77
    iget-object v1, v0, La/gpg;->l:La/mm40;

    .line 78
    .line 79
    iget-object v2, v0, La/gpg;->m:La/ugd;

    .line 80
    .line 81
    iget-object v4, v0, La/gpg;->n:La/l7m0;

    .line 82
    .line 83
    move-object/from16 v16, v1

    .line 84
    .line 85
    iget-object v1, v0, La/gpg;->o:La/l7m0;

    .line 86
    .line 87
    move-object/from16 v19, v1

    .line 88
    .line 89
    move-object/from16 v17, v2

    .line 90
    .line 91
    move-object/from16 v18, v4

    .line 92
    .line 93
    invoke-direct/range {v6 .. v19}, La/dpg;-><init>(La/i3m;ZLa/l7m0;La/sek;La/bek;La/z5s;ZLkotlin/jvm/functions/Function1;ZLa/mm40;La/ugd;La/l7m0;La/l7m0;)V

    .line 94
    .line 95
    .line 96
    const v1, -0xac4a5a0

    .line 97
    .line 98
    .line 99
    invoke-static {v1, v6, v5}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    const/16 v6, 0x6000

    .line 104
    .line 105
    const/4 v1, 0x0

    .line 106
    move-object v2, v1

    .line 107
    iget-object v1, v0, La/gpg;->a:La/d9z;

    .line 108
    .line 109
    iget-object v0, v0, La/gpg;->b:La/l7m0;

    .line 110
    .line 111
    move-object/from16 v20, v2

    .line 112
    .line 113
    move-object v2, v0

    .line 114
    move-object/from16 v0, v20

    .line 115
    .line 116
    invoke-static/range {v0 .. v6}, La/mrv;->Z(La/mm40;La/d9z;La/l7m0;La/xdr;La/ugd;La/fet;I)V

    .line 117
    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_3
    invoke-virtual {v5}, La/fet;->X()V

    .line 121
    .line 122
    .line 123
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 124
    .line 125
    return-object v0
.end method
