.class public final La/zry;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final b:La/bsy;


# direct methods
.method public synthetic constructor <init>(La/bsy;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/zry;->a:B

    iput-object p1, p0, La/zry;->b:La/bsy;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/zry;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/zry;->b:La/bsy;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, La/vvw;->w(La/gre0;)Ljava/lang/reflect/Type;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, La/sry;->x()La/bv9;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-interface {p0}, La/bv9;->getReturnType()Ljava/lang/reflect/Type;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    :cond_0
    return-object v0

    .line 23
    :pswitch_0
    iget-object p0, p0, La/bsy;->j:La/bqy;

    .line 24
    .line 25
    iget-object v0, p0, La/bqy;->d:La/fqy;

    .line 26
    .line 27
    sget-object v1, La/j24;->o:La/c5k;

    .line 28
    .line 29
    sget-object v2, La/j24;->a:[La/iiy;

    .line 30
    .line 31
    const/16 v3, 0x21

    .line 32
    .line 33
    aget-object v2, v2, v3

    .line 34
    .line 35
    invoke-virtual {v1, v2, p0}, La/c5k;->m(La/iiy;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    if-nez p0, :cond_1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    const/4 v0, 0x0

    .line 43
    :goto_0
    return-object v0

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
