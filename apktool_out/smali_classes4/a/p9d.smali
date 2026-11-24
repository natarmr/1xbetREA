.class public final synthetic La/p9d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:I

.field public final synthetic d:Z


# direct methods
.method public synthetic constructor <init>(La/mm40;IIB)V
    .locals 0

    .line 2
    iput-byte p4, p0, La/p9d;->a:B

    iput-object p1, p0, La/p9d;->b:La/mm40;

    iput p2, p0, La/p9d;->c:I

    iput-boolean p3, p0, La/p9d;->d:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;ZI)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    iput-byte v0, p0, La/p9d;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/p9d;->b:La/mm40;

    iput-boolean p2, p0, La/p9d;->d:Z

    iput p3, p0, La/p9d;->c:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/p9d;->a:B

    .line 2
    .line 3
    check-cast p1, La/fet;

    .line 4
    .line 5
    check-cast p2, Ljava/lang/Integer;

    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    iget p2, p0, La/p9d;->c:I

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
    iget-object v0, p0, La/p9d;->b:La/mm40;

    .line 22
    .line 23
    iget-boolean p0, p0, La/p9d;->d:Z

    .line 24
    .line 25
    invoke-static {p2, p1, v0, p0}, La/xbc;->H(ILa/fet;La/mm40;Z)V

    .line 26
    .line 27
    .line 28
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 29
    .line 30
    return-object p0

    .line 31
    :pswitch_0
    iget p2, p0, La/p9d;->c:I

    .line 32
    .line 33
    or-int/lit8 p2, p2, 0x1

    .line 34
    .line 35
    invoke-static {p2}, La/x8x;->L(I)I

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    iget-boolean v0, p0, La/p9d;->d:Z

    .line 40
    .line 41
    iget-object p0, p0, La/p9d;->b:La/mm40;

    .line 42
    .line 43
    invoke-static {p2, v0, p1, p0}, La/tlb;->f(IILa/fet;La/mm40;)V

    .line 44
    .line 45
    .line 46
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 47
    .line 48
    return-object p0

    .line 49
    :pswitch_1
    iget p2, p0, La/p9d;->c:I

    .line 50
    .line 51
    or-int/lit8 p2, p2, 0x1

    .line 52
    .line 53
    invoke-static {p2}, La/x8x;->L(I)I

    .line 54
    .line 55
    .line 56
    move-result p2

    .line 57
    iget-boolean v0, p0, La/p9d;->d:Z

    .line 58
    .line 59
    iget-object p0, p0, La/p9d;->b:La/mm40;

    .line 60
    .line 61
    invoke-static {p2, v0, p1, p0}, La/lmc;->d(IILa/fet;La/mm40;)V

    .line 62
    .line 63
    .line 64
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 65
    .line 66
    return-object p0

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
