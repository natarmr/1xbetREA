.class public final synthetic La/bag;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/kwd;

.field public final synthetic c:La/s7g;

.field public final synthetic d:La/hbg;


# direct methods
.method public synthetic constructor <init>(La/kwd;La/s7g;La/hbg;IB)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/bag;->a:B

    iput-object p1, p0, La/bag;->b:La/kwd;

    iput-object p2, p0, La/bag;->c:La/s7g;

    iput-object p3, p0, La/bag;->d:La/hbg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/bag;->a:B

    .line 2
    .line 3
    const/16 v1, 0x41

    .line 4
    .line 5
    iget-object v2, p0, La/bag;->d:La/hbg;

    .line 6
    .line 7
    iget-object v3, p0, La/bag;->c:La/s7g;

    .line 8
    .line 9
    iget-object p0, p0, La/bag;->b:La/kwd;

    .line 10
    .line 11
    check-cast p1, La/fet;

    .line 12
    .line 13
    check-cast p2, Ljava/lang/Integer;

    .line 14
    .line 15
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    packed-switch v0, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    invoke-static {v1}, La/x8x;->L(I)I

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    invoke-virtual {p0, v3, v2, p1, p2}, La/kwd;->e(La/s7g;La/hbg;La/fet;I)V

    .line 26
    .line 27
    .line 28
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 29
    .line 30
    return-object p0

    .line 31
    :pswitch_0
    invoke-static {v1}, La/x8x;->L(I)I

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    invoke-virtual {p0, v3, v2, p1, p2}, La/kwd;->e(La/s7g;La/hbg;La/fet;I)V

    .line 36
    .line 37
    .line 38
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 39
    .line 40
    return-object p0

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
