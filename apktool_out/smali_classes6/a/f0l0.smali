.class public final synthetic La/f0l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:J

.field public final synthetic d:F

.field public final synthetic e:La/ugd;

.field public final synthetic f:Lkotlin/jvm/functions/Function2;

.field public final synthetic g:La/ugd;

.field public final synthetic h:I

.field public final synthetic i:B

.field public final synthetic j:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/mm40;FJLkotlin/jvm/functions/Function2;La/ugd;La/ugd;La/ugd;II)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/f0l0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/f0l0;->b:La/mm40;

    iput p2, p0, La/f0l0;->d:F

    iput-wide p3, p0, La/f0l0;->c:J

    iput-object p5, p0, La/f0l0;->f:Lkotlin/jvm/functions/Function2;

    iput-object p6, p0, La/f0l0;->e:La/ugd;

    iput-object p7, p0, La/f0l0;->g:La/ugd;

    iput-object p8, p0, La/f0l0;->j:Ljava/lang/Object;

    iput p9, p0, La/f0l0;->h:I

    iput-byte p10, p0, La/f0l0;->i:B

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;La/w2d;JFLa/ugd;Lkotlin/jvm/functions/Function2;La/ugd;II)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput-byte v0, p0, La/f0l0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/f0l0;->b:La/mm40;

    iput-object p2, p0, La/f0l0;->j:Ljava/lang/Object;

    iput-wide p3, p0, La/f0l0;->c:J

    iput p5, p0, La/f0l0;->d:F

    iput-object p6, p0, La/f0l0;->e:La/ugd;

    iput-object p7, p0, La/f0l0;->f:Lkotlin/jvm/functions/Function2;

    iput-object p8, p0, La/f0l0;->g:La/ugd;

    iput p9, p0, La/f0l0;->h:I

    iput-byte p10, p0, La/f0l0;->i:B

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/f0l0;->a:B

    .line 2
    .line 3
    iget v1, p0, La/f0l0;->h:I

    .line 4
    .line 5
    iget-object v2, p0, La/f0l0;->j:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    move-object v4, v2

    .line 11
    check-cast v4, La/w2d;

    .line 12
    .line 13
    move-object v11, p1

    .line 14
    check-cast v11, La/fet;

    .line 15
    .line 16
    move-object/from16 v0, p2

    .line 17
    .line 18
    check-cast v0, Ljava/lang/Integer;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    or-int/lit8 v0, v1, 0x1

    .line 24
    .line 25
    invoke-static {v0}, La/x8x;->L(I)I

    .line 26
    .line 27
    .line 28
    move-result v12

    .line 29
    iget-object v3, p0, La/f0l0;->b:La/mm40;

    .line 30
    .line 31
    iget-wide v5, p0, La/f0l0;->c:J

    .line 32
    .line 33
    iget v7, p0, La/f0l0;->d:F

    .line 34
    .line 35
    iget-object v8, p0, La/f0l0;->e:La/ugd;

    .line 36
    .line 37
    iget-object v9, p0, La/f0l0;->f:Lkotlin/jvm/functions/Function2;

    .line 38
    .line 39
    iget-object v10, p0, La/f0l0;->g:La/ugd;

    .line 40
    .line 41
    iget-byte v13, p0, La/f0l0;->i:B

    .line 42
    .line 43
    invoke-static/range {v3 .. v13}, La/v2n0;->c(La/mm40;La/w2d;JFLa/ugd;Lkotlin/jvm/functions/Function2;La/ugd;La/fet;II)V

    .line 44
    .line 45
    .line 46
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 47
    .line 48
    return-object p0

    .line 49
    :pswitch_0
    move-object v7, v2

    .line 50
    check-cast v7, La/ugd;

    .line 51
    .line 52
    move-object v8, p1

    .line 53
    check-cast v8, La/fet;

    .line 54
    .line 55
    move-object/from16 v0, p2

    .line 56
    .line 57
    check-cast v0, Ljava/lang/Integer;

    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    or-int/lit8 v0, v1, 0x1

    .line 63
    .line 64
    invoke-static {v0}, La/x8x;->L(I)I

    .line 65
    .line 66
    .line 67
    move-result v9

    .line 68
    iget-object v0, p0, La/f0l0;->b:La/mm40;

    .line 69
    .line 70
    iget v1, p0, La/f0l0;->d:F

    .line 71
    .line 72
    iget-wide v2, p0, La/f0l0;->c:J

    .line 73
    .line 74
    iget-object v4, p0, La/f0l0;->f:Lkotlin/jvm/functions/Function2;

    .line 75
    .line 76
    iget-object v5, p0, La/f0l0;->e:La/ugd;

    .line 77
    .line 78
    iget-object v6, p0, La/f0l0;->g:La/ugd;

    .line 79
    .line 80
    iget-byte v10, p0, La/f0l0;->i:B

    .line 81
    .line 82
    invoke-static/range {v0 .. v10}, La/a8k0;->n(La/mm40;FJLkotlin/jvm/functions/Function2;La/ugd;La/ugd;La/ugd;La/fet;II)V

    .line 83
    .line 84
    .line 85
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 86
    .line 87
    return-object p0

    .line 88
    nop

    .line 89
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
