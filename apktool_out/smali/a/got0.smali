.class public final synthetic La/got0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/o5d0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/got0;->a:B

    iput-object p1, p0, La/got0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/got0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/got0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, La/o5d0;

    .line 9
    .line 10
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/uq70;

    .line 15
    .line 16
    return-object p0

    .line 17
    :pswitch_0
    check-cast p0, La/iot0;

    .line 18
    .line 19
    iget-object p0, p0, La/iot0;->d:La/a8z;

    .line 20
    .line 21
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, La/xz9;

    .line 26
    .line 27
    iget-object p0, p0, La/xz9;->b:Ljava/util/Map;

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_1
    check-cast p0, La/iot0;

    .line 31
    .line 32
    iget-object v0, p0, La/iot0;->a:Lkotlin/jvm/functions/Function1;

    .line 33
    .line 34
    iget-object p0, p0, La/iot0;->d:La/a8z;

    .line 35
    .line 36
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/xz9;

    .line 41
    .line 42
    iget-object p0, p0, La/xz9;->a:La/tz9;

    .line 43
    .line 44
    invoke-interface {v0, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/b0a;

    .line 49
    .line 50
    return-object p0

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
