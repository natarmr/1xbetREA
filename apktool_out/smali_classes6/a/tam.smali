.class public final synthetic La/tam;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:I

.field public final synthetic c:J

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IJLkotlin/jvm/functions/Function0;I)V
    .locals 0

    .line 1
    const/4 p5, 0x1

    iput-byte p5, p0, La/tam;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, La/tam;->b:I

    iput-wide p2, p0, La/tam;->c:J

    iput-object p4, p0, La/tam;->d:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(JLa/ugd;I)V
    .locals 1

    .line 2
    const/4 v0, 0x2

    iput-byte v0, p0, La/tam;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, La/tam;->c:J

    iput-object p3, p0, La/tam;->d:Ljava/lang/Object;

    iput p4, p0, La/tam;->b:I

    return-void
.end method

.method public synthetic constructor <init>(La/a4x;JI)V
    .locals 1

    .line 3
    const/4 v0, 0x0

    iput-byte v0, p0, La/tam;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/tam;->d:Ljava/lang/Object;

    iput-wide p2, p0, La/tam;->c:J

    iput p4, p0, La/tam;->b:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, La/tam;->a:B

    .line 2
    .line 3
    iget v1, p0, La/tam;->b:I

    .line 4
    .line 5
    iget-wide v2, p0, La/tam;->c:J

    .line 6
    .line 7
    const/4 v4, 0x1

    .line 8
    iget-object v5, p0, La/tam;->d:Ljava/lang/Object;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast v5, La/ugd;

    .line 14
    .line 15
    check-cast p1, La/fet;

    .line 16
    .line 17
    check-cast p2, Ljava/lang/Integer;

    .line 18
    .line 19
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    or-int/lit8 p0, v1, 0x1

    .line 23
    .line 24
    invoke-static {p0}, La/x8x;->L(I)I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    invoke-static {v2, v3, v5, p1, p0}, La/w9x;->n(JLa/ugd;La/fet;I)V

    .line 29
    .line 30
    .line 31
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 32
    .line 33
    return-object p0

    .line 34
    :pswitch_0
    move-object v3, v5

    .line 35
    check-cast v3, Lkotlin/jvm/functions/Function0;

    .line 36
    .line 37
    check-cast p1, La/fet;

    .line 38
    .line 39
    check-cast p2, Ljava/lang/Integer;

    .line 40
    .line 41
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    invoke-static {v4}, La/x8x;->L(I)I

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    iget v0, p0, La/tam;->b:I

    .line 49
    .line 50
    iget-wide v1, p0, La/tam;->c:J

    .line 51
    .line 52
    move-object v4, p1

    .line 53
    invoke-static/range {v0 .. v5}, La/z5n;->a(IJLkotlin/jvm/functions/Function0;La/fet;I)V

    .line 54
    .line 55
    .line 56
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 57
    .line 58
    return-object p0

    .line 59
    :pswitch_1
    check-cast v5, La/a4x;

    .line 60
    .line 61
    check-cast p1, La/fet;

    .line 62
    .line 63
    check-cast p2, Ljava/lang/Integer;

    .line 64
    .line 65
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 66
    .line 67
    .line 68
    or-int/lit8 p0, v1, 0x1

    .line 69
    .line 70
    invoke-static {p0}, La/x8x;->L(I)I

    .line 71
    .line 72
    .line 73
    move-result p0

    .line 74
    invoke-static {v5, v2, v3, p1, p0}, La/kbc;->C(La/a4x;JLa/fet;I)V

    .line 75
    .line 76
    .line 77
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 78
    .line 79
    return-object p0

    .line 80
    nop

    .line 81
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
