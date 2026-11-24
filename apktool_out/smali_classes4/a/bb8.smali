.class public final synthetic La/bb8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/cb8;


# direct methods
.method public synthetic constructor <init>(La/cb8;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/bb8;->a:B

    iput-object p1, p0, La/bb8;->b:La/cb8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/bb8;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/bb8;->b:La/cb8;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, La/cb8;->i:La/zbk;

    .line 9
    .line 10
    invoke-virtual {p0}, La/zbk;->getValue()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, Ljava/lang/Iterable;

    .line 15
    .line 16
    invoke-static {p0}, La/r3d;->r(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->P0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0

    .line 25
    :pswitch_0
    iget-object p0, p0, La/cb8;->e:La/pz40;

    .line 26
    .line 27
    check-cast p0, La/hgk0;

    .line 28
    .line 29
    invoke-virtual {p0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    check-cast p0, Ljava/util/Map;

    .line 34
    .line 35
    invoke-static {p0}, La/ckv0;->a(Ljava/util/Map;)Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
