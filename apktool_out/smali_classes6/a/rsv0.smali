.class public final synthetic La/rsv0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:La/ywv0;

.field public final synthetic b:La/l7m0;

.field public final synthetic c:I

.field public final synthetic d:F

.field public final synthetic e:I

.field public final synthetic f:Z

.field public final synthetic g:Lkotlin/jvm/functions/Function2;

.field public final synthetic h:La/ugd;

.field public final synthetic i:Lkotlin/jvm/functions/Function2;


# direct methods
.method public synthetic constructor <init>(La/ywv0;La/l7m0;IFIZLa/ugd;La/ugd;La/ugd;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/rsv0;->a:La/ywv0;

    iput-object p2, p0, La/rsv0;->b:La/l7m0;

    iput p3, p0, La/rsv0;->c:I

    iput p4, p0, La/rsv0;->d:F

    iput p5, p0, La/rsv0;->e:I

    iput-boolean p6, p0, La/rsv0;->f:Z

    iput-object p7, p0, La/rsv0;->g:Lkotlin/jvm/functions/Function2;

    iput-object p8, p0, La/rsv0;->h:La/ugd;

    iput-object p9, p0, La/rsv0;->i:Lkotlin/jvm/functions/Function2;

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    move-object v7, p1

    .line 2
    check-cast v7, Lkotlin/jvm/functions/Function2;

    .line 3
    .line 4
    move-object v11, p2

    .line 5
    check-cast v11, La/fet;

    .line 6
    .line 7
    move-object/from16 p1, p3

    .line 8
    .line 9
    check-cast p1, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    and-int/lit8 v0, p1, 0x6

    .line 16
    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {v11, v7}, La/fet;->i(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    const/4 v0, 0x4

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 v0, 0x2

    .line 28
    :goto_0
    or-int/2addr p1, v0

    .line 29
    :cond_1
    and-int/lit8 v0, p1, 0x13

    .line 30
    .line 31
    const/16 v1, 0x12

    .line 32
    .line 33
    if-eq v0, v1, :cond_2

    .line 34
    .line 35
    const/4 v0, 0x1

    .line 36
    goto :goto_1

    .line 37
    :cond_2
    const/4 v0, 0x0

    .line 38
    :goto_1
    and-int/lit8 v1, p1, 0x1

    .line 39
    .line 40
    invoke-virtual {v11, v1, v0}, La/fet;->U(IZ)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_3

    .line 45
    .line 46
    sget-object v0, La/jm40;->b:La/jm40;

    .line 47
    .line 48
    const/high16 v1, 0x3f800000    # 1.0f

    .line 49
    .line 50
    invoke-static {v0, v1}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    shl-int/lit8 p1, p1, 0x15

    .line 55
    .line 56
    const/high16 v1, 0x1c00000

    .line 57
    .line 58
    and-int/2addr p1, v1

    .line 59
    or-int/lit8 v12, p1, 0x6

    .line 60
    .line 61
    iget-object v1, p0, La/rsv0;->a:La/ywv0;

    .line 62
    .line 63
    iget-object v2, p0, La/rsv0;->b:La/l7m0;

    .line 64
    .line 65
    iget v3, p0, La/rsv0;->c:I

    .line 66
    .line 67
    iget v4, p0, La/rsv0;->d:F

    .line 68
    .line 69
    iget v5, p0, La/rsv0;->e:I

    .line 70
    .line 71
    iget-boolean v6, p0, La/rsv0;->f:Z

    .line 72
    .line 73
    iget-object v8, p0, La/rsv0;->g:Lkotlin/jvm/functions/Function2;

    .line 74
    .line 75
    iget-object v9, p0, La/rsv0;->h:La/ugd;

    .line 76
    .line 77
    iget-object v10, p0, La/rsv0;->i:Lkotlin/jvm/functions/Function2;

    .line 78
    .line 79
    invoke-static/range {v0 .. v12}, La/jtm0;->d(La/mm40;La/ywv0;La/l7m0;IFIZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;La/ugd;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 80
    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_3
    invoke-virtual {v11}, La/fet;->X()V

    .line 84
    .line 85
    .line 86
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 87
    .line 88
    return-object p0
.end method
