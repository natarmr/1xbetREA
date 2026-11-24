.class public final synthetic La/lbd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:La/dk5;

.field public final synthetic b:La/l7m0;

.field public final synthetic c:La/l7m0;

.field public final synthetic d:La/pz40;

.field public final synthetic e:La/pz40;

.field public final synthetic f:La/pz40;

.field public final synthetic g:La/vne;

.field public final synthetic h:La/d9d0;

.field public final synthetic i:La/pz40;

.field public final synthetic j:La/l7m0;


# direct methods
.method public synthetic constructor <init>(La/dk5;La/l7m0;La/l7m0;La/pz40;La/pz40;La/pz40;La/vne;La/d9d0;La/pz40;La/l7m0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/lbd;->a:La/dk5;

    iput-object p2, p0, La/lbd;->b:La/l7m0;

    iput-object p3, p0, La/lbd;->c:La/l7m0;

    iput-object p4, p0, La/lbd;->d:La/pz40;

    iput-object p5, p0, La/lbd;->e:La/pz40;

    iput-object p6, p0, La/lbd;->f:La/pz40;

    iput-object p7, p0, La/lbd;->g:La/vne;

    iput-object p8, p0, La/lbd;->h:La/d9d0;

    iput-object p9, p0, La/lbd;->i:La/pz40;

    iput-object p10, p0, La/lbd;->j:La/l7m0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, La/hcz;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    new-instance v2, La/qb;

    .line 11
    .line 12
    const/16 v6, 0x17

    .line 13
    .line 14
    const/4 v7, 0x0

    .line 15
    iget-object v3, v0, La/lbd;->a:La/dk5;

    .line 16
    .line 17
    iget-object v4, v0, La/lbd;->b:La/l7m0;

    .line 18
    .line 19
    iget-object v5, v0, La/lbd;->c:La/l7m0;

    .line 20
    .line 21
    invoke-direct/range {v2 .. v7}, La/qb;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;BB)V

    .line 22
    .line 23
    .line 24
    new-instance v4, La/ugd;

    .line 25
    .line 26
    const v5, 0x1bcb1ba6

    .line 27
    .line 28
    .line 29
    const/4 v6, 0x1

    .line 30
    invoke-direct {v4, v5, v6, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    const/4 v5, 0x3

    .line 35
    invoke-static {v1, v2, v2, v4, v5}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 36
    .line 37
    .line 38
    new-instance v8, La/mbd;

    .line 39
    .line 40
    iget-object v9, v0, La/lbd;->d:La/pz40;

    .line 41
    .line 42
    iget-object v10, v0, La/lbd;->e:La/pz40;

    .line 43
    .line 44
    iget-object v12, v0, La/lbd;->f:La/pz40;

    .line 45
    .line 46
    iget-object v13, v0, La/lbd;->g:La/vne;

    .line 47
    .line 48
    iget-object v14, v0, La/lbd;->h:La/d9d0;

    .line 49
    .line 50
    iget-object v15, v0, La/lbd;->i:La/pz40;

    .line 51
    .line 52
    iget-object v0, v0, La/lbd;->j:La/l7m0;

    .line 53
    .line 54
    move-object/from16 v16, v0

    .line 55
    .line 56
    move-object v11, v3

    .line 57
    invoke-direct/range {v8 .. v16}, La/mbd;-><init>(La/pz40;La/pz40;La/dk5;La/pz40;La/vne;La/d9d0;La/pz40;La/l7m0;)V

    .line 58
    .line 59
    .line 60
    new-instance v0, La/ugd;

    .line 61
    .line 62
    const v3, -0x265a0771

    .line 63
    .line 64
    .line 65
    invoke-direct {v0, v3, v6, v8}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    invoke-static {v1, v2, v2, v0, v5}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 69
    .line 70
    .line 71
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 72
    .line 73
    return-object v0
.end method
