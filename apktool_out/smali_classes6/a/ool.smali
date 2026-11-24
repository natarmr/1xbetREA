.class public final synthetic La/ool;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:J

.field public final synthetic d:Lkotlin/jvm/functions/Function0;

.field public final synthetic e:I

.field public final synthetic f:B

.field public final synthetic g:Ljava/lang/Object;

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(JLa/qol;La/mm40;La/tol;La/sol;La/iol;Lkotlin/jvm/functions/Function0;II)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/ool;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, La/ool;->c:J

    iput-object p3, p0, La/ool;->g:Ljava/lang/Object;

    iput-object p4, p0, La/ool;->b:La/mm40;

    iput-object p5, p0, La/ool;->h:Ljava/lang/Object;

    iput-object p6, p0, La/ool;->i:Ljava/lang/Object;

    iput-object p7, p0, La/ool;->j:Ljava/lang/Object;

    iput-object p8, p0, La/ool;->d:Lkotlin/jvm/functions/Function0;

    iput p9, p0, La/ool;->e:I

    iput-byte p10, p0, La/ool;->f:B

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;La/vul;La/wul;La/wul;JLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;II)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput-byte v0, p0, La/ool;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/ool;->b:La/mm40;

    iput-object p2, p0, La/ool;->g:Ljava/lang/Object;

    iput-object p3, p0, La/ool;->h:Ljava/lang/Object;

    iput-object p4, p0, La/ool;->i:Ljava/lang/Object;

    iput-wide p5, p0, La/ool;->c:J

    iput-object p7, p0, La/ool;->d:Lkotlin/jvm/functions/Function0;

    iput-object p8, p0, La/ool;->j:Ljava/lang/Object;

    iput p9, p0, La/ool;->e:I

    iput-byte p10, p0, La/ool;->f:B

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ool;->a:B

    .line 4
    .line 5
    iget v2, v0, La/ool;->e:I

    .line 6
    .line 7
    iget-object v3, v0, La/ool;->j:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, v0, La/ool;->i:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v5, v0, La/ool;->h:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v6, v0, La/ool;->g:Ljava/lang/Object;

    .line 14
    .line 15
    packed-switch v1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    move-object v8, v6

    .line 19
    check-cast v8, La/vul;

    .line 20
    .line 21
    move-object v9, v5

    .line 22
    check-cast v9, La/wul;

    .line 23
    .line 24
    move-object v10, v4

    .line 25
    check-cast v10, La/wul;

    .line 26
    .line 27
    move-object v14, v3

    .line 28
    check-cast v14, Lkotlin/jvm/functions/Function0;

    .line 29
    .line 30
    move-object/from16 v15, p1

    .line 31
    .line 32
    check-cast v15, La/fet;

    .line 33
    .line 34
    move-object/from16 v1, p2

    .line 35
    .line 36
    check-cast v1, Ljava/lang/Integer;

    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    or-int/lit8 v1, v2, 0x1

    .line 42
    .line 43
    invoke-static {v1}, La/x8x;->L(I)I

    .line 44
    .line 45
    .line 46
    move-result v16

    .line 47
    iget-object v7, v0, La/ool;->b:La/mm40;

    .line 48
    .line 49
    iget-wide v11, v0, La/ool;->c:J

    .line 50
    .line 51
    iget-object v13, v0, La/ool;->d:Lkotlin/jvm/functions/Function0;

    .line 52
    .line 53
    iget-byte v0, v0, La/ool;->f:B

    .line 54
    .line 55
    move/from16 v17, v0

    .line 56
    .line 57
    invoke-static/range {v7 .. v17}, La/gkb;->i(La/mm40;La/vul;La/wul;La/wul;JLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/fet;II)V

    .line 58
    .line 59
    .line 60
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 61
    .line 62
    return-object v0

    .line 63
    :pswitch_0
    check-cast v6, La/qol;

    .line 64
    .line 65
    check-cast v5, La/tol;

    .line 66
    .line 67
    check-cast v4, La/sol;

    .line 68
    .line 69
    move-object v7, v3

    .line 70
    check-cast v7, La/iol;

    .line 71
    .line 72
    move-object/from16 v9, p1

    .line 73
    .line 74
    check-cast v9, La/fet;

    .line 75
    .line 76
    move-object/from16 v1, p2

    .line 77
    .line 78
    check-cast v1, Ljava/lang/Integer;

    .line 79
    .line 80
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    or-int/lit8 v1, v2, 0x1

    .line 84
    .line 85
    invoke-static {v1}, La/x8x;->L(I)I

    .line 86
    .line 87
    .line 88
    move-result v10

    .line 89
    iget-wide v1, v0, La/ool;->c:J

    .line 90
    .line 91
    move-object v3, v6

    .line 92
    move-object v6, v4

    .line 93
    iget-object v4, v0, La/ool;->b:La/mm40;

    .line 94
    .line 95
    iget-object v8, v0, La/ool;->d:Lkotlin/jvm/functions/Function0;

    .line 96
    .line 97
    iget-byte v11, v0, La/ool;->f:B

    .line 98
    .line 99
    invoke-static/range {v1 .. v11}, La/fxb;->i(JLa/qol;La/mm40;La/tol;La/sol;La/iol;Lkotlin/jvm/functions/Function0;La/fet;II)V

    .line 100
    .line 101
    .line 102
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 103
    .line 104
    return-object v0

    .line 105
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
