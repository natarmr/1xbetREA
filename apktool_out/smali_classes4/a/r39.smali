.class public final synthetic La/r39;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/pbz;


# direct methods
.method public synthetic constructor <init>(La/pbz;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/r39;->a:B

    iput-object p1, p0, La/r39;->b:La/pbz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/r39;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/r39;->b:La/pbz;

    .line 5
    .line 6
    check-cast p1, La/lwk;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    new-instance p1, La/u39;

    .line 12
    .line 13
    const/4 v0, 0x2

    .line 14
    invoke-direct {p1, p0, v0}, La/u39;-><init>(La/pbz;B)V

    .line 15
    .line 16
    .line 17
    return-object p1

    .line 18
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    if-eqz p0, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0}, La/pbz;->a()La/pbz;

    .line 24
    .line 25
    .line 26
    move-object v1, p0

    .line 27
    :cond_0
    new-instance p0, La/u39;

    .line 28
    .line 29
    const/4 p1, 0x1

    .line 30
    invoke-direct {p0, v1, p1}, La/u39;-><init>(La/pbz;B)V

    .line 31
    .line 32
    .line 33
    return-object p0

    .line 34
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    if-eqz p0, :cond_1

    .line 38
    .line 39
    invoke-virtual {p0}, La/pbz;->a()La/pbz;

    .line 40
    .line 41
    .line 42
    move-object v1, p0

    .line 43
    :cond_1
    new-instance p0, La/u39;

    .line 44
    .line 45
    const/4 p1, 0x0

    .line 46
    invoke-direct {p0, v1, p1}, La/u39;-><init>(La/pbz;B)V

    .line 47
    .line 48
    .line 49
    return-object p0

    .line 50
    nop

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
