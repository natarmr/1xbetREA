.class public final synthetic La/qkh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/klh;


# direct methods
.method public synthetic constructor <init>(La/klh;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/qkh;->a:B

    iput-object p1, p0, La/qkh;->b:La/klh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/qkh;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/qkh;->b:La/klh;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, La/zjh;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, La/klh;->a:Ljava/lang/String;

    .line 14
    .line 15
    new-instance v0, Lkotlin/Pair;

    .line 16
    .line 17
    invoke-direct {v0, p0, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-object v0

    .line 21
    :pswitch_0
    check-cast p1, La/ojh;

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    iget-object p1, p1, La/ojh;->f:Ljava/util/List;

    .line 27
    .line 28
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->I(Ljava/lang/Iterable;)La/sx3;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    new-instance v0, La/qkh;

    .line 33
    .line 34
    const/4 v1, 0x1

    .line 35
    invoke-direct {v0, p0, v1}, La/qkh;-><init>(La/klh;B)V

    .line 36
    .line 37
    .line 38
    invoke-static {p1, v0}, La/pgi0;->p(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)La/qls0;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
