.class public final synthetic La/xwk;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:F

.field public final synthetic d:J

.field public final synthetic e:I

.field public final synthetic f:B


# direct methods
.method public synthetic constructor <init>(La/mm40;FJIIB)V
    .locals 0

    .line 1
    iput-byte p7, p0, La/xwk;->a:B

    iput-object p1, p0, La/xwk;->b:La/mm40;

    iput p2, p0, La/xwk;->c:F

    iput-wide p3, p0, La/xwk;->d:J

    iput p5, p0, La/xwk;->e:I

    iput-byte p6, p0, La/xwk;->f:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/xwk;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    move-object v5, p1

    .line 7
    check-cast v5, La/fet;

    .line 8
    .line 9
    check-cast p2, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget p1, p0, La/xwk;->e:I

    .line 15
    .line 16
    or-int/lit8 p1, p1, 0x1

    .line 17
    .line 18
    invoke-static {p1}, La/x8x;->L(I)I

    .line 19
    .line 20
    .line 21
    move-result v6

    .line 22
    iget-object v1, p0, La/xwk;->b:La/mm40;

    .line 23
    .line 24
    iget v2, p0, La/xwk;->c:F

    .line 25
    .line 26
    iget-wide v3, p0, La/xwk;->d:J

    .line 27
    .line 28
    iget-byte v7, p0, La/xwk;->f:B

    .line 29
    .line 30
    invoke-static/range {v1 .. v7}, La/jcb;->v(La/mm40;FJLa/fet;II)V

    .line 31
    .line 32
    .line 33
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_0
    move-object v4, p1

    .line 37
    check-cast v4, La/fet;

    .line 38
    .line 39
    check-cast p2, Ljava/lang/Integer;

    .line 40
    .line 41
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    iget p1, p0, La/xwk;->e:I

    .line 45
    .line 46
    or-int/lit8 p1, p1, 0x1

    .line 47
    .line 48
    invoke-static {p1}, La/x8x;->L(I)I

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    iget-object v0, p0, La/xwk;->b:La/mm40;

    .line 53
    .line 54
    iget v1, p0, La/xwk;->c:F

    .line 55
    .line 56
    iget-wide v2, p0, La/xwk;->d:J

    .line 57
    .line 58
    iget-byte v6, p0, La/xwk;->f:B

    .line 59
    .line 60
    invoke-static/range {v0 .. v6}, La/jcb;->H(La/mm40;FJLa/fet;II)V

    .line 61
    .line 62
    .line 63
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 64
    .line 65
    return-object p0

    .line 66
    nop

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
