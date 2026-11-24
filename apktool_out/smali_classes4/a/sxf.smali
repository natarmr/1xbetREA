.class public final synthetic La/sxf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:I

.field public final synthetic c:Lkotlin/jvm/functions/Function0;


# direct methods
.method public synthetic constructor <init>(BILkotlin/jvm/functions/Function0;)V
    .locals 0

    .line 2
    iput-byte p1, p0, La/sxf;->a:B

    iput-object p3, p0, La/sxf;->c:Lkotlin/jvm/functions/Function0;

    iput p2, p0, La/sxf;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ILkotlin/jvm/functions/Function0;I)V
    .locals 0

    .line 1
    const/4 p3, 0x1

    iput-byte p3, p0, La/sxf;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, La/sxf;->b:I

    iput-object p2, p0, La/sxf;->c:Lkotlin/jvm/functions/Function0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/sxf;->a:B

    .line 2
    .line 3
    check-cast p1, La/fet;

    .line 4
    .line 5
    check-cast p2, Ljava/lang/Integer;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 11
    .line 12
    .line 13
    iget p2, p0, La/sxf;->b:I

    .line 14
    .line 15
    or-int/lit8 p2, p2, 0x1

    .line 16
    .line 17
    invoke-static {p2}, La/x8x;->L(I)I

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    iget-object p0, p0, La/sxf;->c:Lkotlin/jvm/functions/Function0;

    .line 22
    .line 23
    invoke-static {p2, p1, p0}, La/zgc;->A(ILa/fet;Lkotlin/jvm/functions/Function0;)V

    .line 24
    .line 25
    .line 26
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 27
    .line 28
    return-object p0

    .line 29
    :pswitch_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    const/4 p2, 0x1

    .line 33
    invoke-static {p2}, La/x8x;->L(I)I

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    iget v0, p0, La/sxf;->b:I

    .line 38
    .line 39
    iget-object p0, p0, La/sxf;->c:Lkotlin/jvm/functions/Function0;

    .line 40
    .line 41
    invoke-static {v0, p2, p1, p0}, La/n2x;->c(IILa/fet;Lkotlin/jvm/functions/Function0;)V

    .line 42
    .line 43
    .line 44
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 45
    .line 46
    return-object p0

    .line 47
    :pswitch_1
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 48
    .line 49
    .line 50
    iget p2, p0, La/sxf;->b:I

    .line 51
    .line 52
    or-int/lit8 p2, p2, 0x1

    .line 53
    .line 54
    invoke-static {p2}, La/x8x;->L(I)I

    .line 55
    .line 56
    .line 57
    move-result p2

    .line 58
    iget-object p0, p0, La/sxf;->c:Lkotlin/jvm/functions/Function0;

    .line 59
    .line 60
    invoke-static {p2, p1, p0}, La/j2e;->q(ILa/fet;Lkotlin/jvm/functions/Function0;)V

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
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
