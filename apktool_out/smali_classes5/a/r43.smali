.class public final La/r43;
.super La/guy;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/oms0;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;

.field public final synthetic d:La/mm40;

.field public final synthetic e:I

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:Ljava/lang/Object;

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:La/ydr;


# direct methods
.method public constructor <init>(La/oms0;La/mm40;Lkotlin/jvm/functions/Function1;La/u12;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/r43;->a:B

    .line 3
    .line 4
    iput-object p1, p0, La/r43;->b:La/oms0;

    .line 5
    .line 6
    iput-object p2, p0, La/r43;->d:La/mm40;

    .line 7
    .line 8
    iput-object p3, p0, La/r43;->c:Lkotlin/jvm/functions/Function1;

    .line 9
    .line 10
    iput-object p4, p0, La/r43;->h:Ljava/lang/Object;

    .line 11
    .line 12
    iput-object p5, p0, La/r43;->f:Ljava/lang/Object;

    .line 13
    .line 14
    iput-object p6, p0, La/r43;->g:Ljava/lang/Object;

    .line 15
    .line 16
    iput-object p7, p0, La/r43;->i:La/ydr;

    .line 17
    .line 18
    iput p8, p0, La/r43;->e:I

    .line 19
    .line 20
    const/4 p1, 0x2

    .line 21
    invoke-direct {p0, p1}, La/guy;-><init>(I)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public constructor <init>(La/oms0;Lkotlin/jvm/functions/Function1;La/mm40;La/pzn;La/alo;Lkotlin/jvm/functions/Function2;La/ugd;I)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/r43;->a:B

    .line 25
    iput-object p1, p0, La/r43;->b:La/oms0;

    iput-object p2, p0, La/r43;->c:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, La/r43;->d:La/mm40;

    iput-object p4, p0, La/r43;->f:Ljava/lang/Object;

    iput-object p5, p0, La/r43;->g:Ljava/lang/Object;

    iput-object p6, p0, La/r43;->h:Ljava/lang/Object;

    iput-object p7, p0, La/r43;->i:La/ydr;

    iput p8, p0, La/r43;->e:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, La/guy;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/r43;->a:B

    .line 2
    .line 3
    iget v1, p0, La/r43;->e:I

    .line 4
    .line 5
    iget-object v2, p0, La/r43;->h:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, La/r43;->g:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, p0, La/r43;->f:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    move-object v12, p1

    .line 15
    check-cast v12, La/fet;

    .line 16
    .line 17
    move-object/from16 v0, p2

    .line 18
    .line 19
    check-cast v0, Ljava/lang/Number;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 22
    .line 23
    .line 24
    move-object v8, v4

    .line 25
    check-cast v8, La/pzn;

    .line 26
    .line 27
    move-object v9, v3

    .line 28
    check-cast v9, La/alo;

    .line 29
    .line 30
    move-object v10, v2

    .line 31
    check-cast v10, Lkotlin/jvm/functions/Function2;

    .line 32
    .line 33
    iget-object v0, p0, La/r43;->i:La/ydr;

    .line 34
    .line 35
    move-object v11, v0

    .line 36
    check-cast v11, La/ugd;

    .line 37
    .line 38
    or-int/lit8 v0, v1, 0x1

    .line 39
    .line 40
    invoke-static {v0}, La/x8x;->L(I)I

    .line 41
    .line 42
    .line 43
    move-result v13

    .line 44
    iget-object v5, p0, La/r43;->b:La/oms0;

    .line 45
    .line 46
    iget-object v6, p0, La/r43;->c:Lkotlin/jvm/functions/Function1;

    .line 47
    .line 48
    iget-object v7, p0, La/r43;->d:La/mm40;

    .line 49
    .line 50
    invoke-static/range {v5 .. v13}, La/b34;->d(La/oms0;Lkotlin/jvm/functions/Function1;La/mm40;La/pzn;La/alo;Lkotlin/jvm/functions/Function2;La/ugd;La/fet;I)V

    .line 51
    .line 52
    .line 53
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    return-object p0

    .line 56
    :pswitch_0
    move-object v7, p1

    .line 57
    check-cast v7, La/fet;

    .line 58
    .line 59
    move-object/from16 v0, p2

    .line 60
    .line 61
    check-cast v0, Ljava/lang/Number;

    .line 62
    .line 63
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 64
    .line 65
    .line 66
    check-cast v2, La/u12;

    .line 67
    .line 68
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 69
    .line 70
    move-object v5, v3

    .line 71
    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 72
    .line 73
    or-int/lit8 v0, v1, 0x1

    .line 74
    .line 75
    invoke-static {v0}, La/x8x;->L(I)I

    .line 76
    .line 77
    .line 78
    move-result v8

    .line 79
    iget-object v0, p0, La/r43;->b:La/oms0;

    .line 80
    .line 81
    iget-object v1, p0, La/r43;->d:La/mm40;

    .line 82
    .line 83
    move-object v3, v2

    .line 84
    iget-object v2, p0, La/r43;->c:Lkotlin/jvm/functions/Function1;

    .line 85
    .line 86
    iget-object v6, p0, La/r43;->i:La/ydr;

    .line 87
    .line 88
    invoke-static/range {v0 .. v8}, La/ay3;->g(La/oms0;La/mm40;Lkotlin/jvm/functions/Function1;La/u12;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;La/fet;I)V

    .line 89
    .line 90
    .line 91
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 92
    .line 93
    return-object p0

    .line 94
    nop

    .line 95
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
