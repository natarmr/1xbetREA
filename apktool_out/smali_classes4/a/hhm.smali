.class public final synthetic La/hhm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/xk80;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(La/xk80;I)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    iput-byte v0, p0, La/hhm;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/hhm;->b:La/xk80;

    iput p2, p0, La/hhm;->c:I

    return-void
.end method

.method public synthetic constructor <init>(La/xk80;IIB)V
    .locals 0

    .line 2
    iput-byte p4, p0, La/hhm;->a:B

    iput-object p1, p0, La/hhm;->b:La/xk80;

    iput p2, p0, La/hhm;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/hhm;->a:B

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
    iget p2, p0, La/hhm;->c:I

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
    iget-object p0, p0, La/hhm;->b:La/xk80;

    .line 22
    .line 23
    invoke-static {p0, p1, p2}, La/wdx;->n(La/xk80;La/fet;I)V

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
    iget-object v0, p0, La/hhm;->b:La/xk80;

    .line 38
    .line 39
    iget p0, p0, La/hhm;->c:I

    .line 40
    .line 41
    invoke-static {v0, p0, p1, p2}, La/lgb;->c(La/xk80;ILa/fet;I)V

    .line 42
    .line 43
    .line 44
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 45
    .line 46
    return-object p0

    .line 47
    :pswitch_1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    const/4 p2, 0x1

    .line 51
    invoke-static {p2}, La/x8x;->L(I)I

    .line 52
    .line 53
    .line 54
    move-result p2

    .line 55
    iget-object v0, p0, La/hhm;->b:La/xk80;

    .line 56
    .line 57
    iget p0, p0, La/hhm;->c:I

    .line 58
    .line 59
    invoke-static {v0, p0, p1, p2}, La/lgb;->c(La/xk80;ILa/fet;I)V

    .line 60
    .line 61
    .line 62
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 63
    .line 64
    return-object p0

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
