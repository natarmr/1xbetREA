.class public final synthetic La/qwb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:La/a4x;

.field public final synthetic d:La/xwb;


# direct methods
.method public synthetic constructor <init>(La/mm40;La/a4x;La/xwb;IB)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/qwb;->a:B

    iput-object p1, p0, La/qwb;->b:La/mm40;

    iput-object p2, p0, La/qwb;->c:La/a4x;

    iput-object p3, p0, La/qwb;->d:La/xwb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/qwb;->a:B

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
    const/4 p2, 0x1

    .line 14
    invoke-static {p2}, La/x8x;->L(I)I

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    iget-object v0, p0, La/qwb;->b:La/mm40;

    .line 19
    .line 20
    iget-object v1, p0, La/qwb;->c:La/a4x;

    .line 21
    .line 22
    iget-object p0, p0, La/qwb;->d:La/xwb;

    .line 23
    .line 24
    invoke-static {v0, v1, p0, p1, p2}, La/wwb;->a(La/mm40;La/a4x;La/xwb;La/fet;I)V

    .line 25
    .line 26
    .line 27
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_0
    const/4 p2, 0x1

    .line 31
    invoke-static {p2}, La/x8x;->L(I)I

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    iget-object v0, p0, La/qwb;->b:La/mm40;

    .line 36
    .line 37
    iget-object v1, p0, La/qwb;->c:La/a4x;

    .line 38
    .line 39
    iget-object p0, p0, La/qwb;->d:La/xwb;

    .line 40
    .line 41
    invoke-static {v0, v1, p0, p1, p2}, La/wwb;->a(La/mm40;La/a4x;La/xwb;La/fet;I)V

    .line 42
    .line 43
    .line 44
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 45
    .line 46
    return-object p0

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
