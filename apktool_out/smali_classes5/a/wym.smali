.class public final synthetic La/wym;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:La/azm;

.field public final synthetic d:Z


# direct methods
.method public synthetic constructor <init>(La/mm40;La/azm;ZIB)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/wym;->a:B

    packed-switch p5, :pswitch_data_0

    sget-object p4, La/q6x;->a:La/q6x;

    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/wym;->b:La/mm40;

    iput-object p2, p0, La/wym;->c:La/azm;

    iput-boolean p3, p0, La/wym;->d:Z

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/wym;->a:B

    .line 2
    .line 3
    iget-boolean v1, p0, La/wym;->d:Z

    .line 4
    .line 5
    iget-object v2, p0, La/wym;->c:La/azm;

    .line 6
    .line 7
    iget-object p0, p0, La/wym;->b:La/mm40;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p1, La/fet;

    .line 13
    .line 14
    check-cast p2, Ljava/lang/Integer;

    .line 15
    .line 16
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    const/16 p2, 0x181

    .line 20
    .line 21
    invoke-static {p2}, La/x8x;->L(I)I

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    invoke-static {p0, v2, v1, p1, p2}, La/kpb;->q(La/mm40;La/azm;ZLa/fet;I)V

    .line 26
    .line 27
    .line 28
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 29
    .line 30
    return-object p0

    .line 31
    :pswitch_0
    sget-object v0, La/q6x;->a:La/q6x;

    .line 32
    .line 33
    check-cast p1, La/fet;

    .line 34
    .line 35
    check-cast p2, Ljava/lang/Integer;

    .line 36
    .line 37
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    const/16 p2, 0xc01

    .line 41
    .line 42
    invoke-static {p2}, La/x8x;->L(I)I

    .line 43
    .line 44
    .line 45
    move-result p2

    .line 46
    invoke-static {p0, v2, v1, p1, p2}, La/sj3;->E(La/mm40;La/azm;ZLa/fet;I)V

    .line 47
    .line 48
    .line 49
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 50
    .line 51
    return-object p0

    .line 52
    nop

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
