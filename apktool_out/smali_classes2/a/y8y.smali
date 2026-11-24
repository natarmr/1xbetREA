.class public final La/y8y;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final b:La/b9y;


# direct methods
.method public synthetic constructor <init>(La/b9y;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/y8y;->a:B

    iput-object p1, p0, La/y8y;->b:La/b9y;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/y8y;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/y8y;->b:La/b9y;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/z8y;

    .line 9
    .line 10
    invoke-direct {v0, p0}, La/z8y;-><init>(La/b9y;)V

    .line 11
    .line 12
    .line 13
    return-object v0

    .line 14
    :pswitch_0
    const-class v0, La/a0o;

    .line 15
    .line 16
    sget-object v1, La/sre0;->a:La/tre0;

    .line 17
    .line 18
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sget-object v1, Lkotlin/reflect/KTypeProjection;->c:La/piy;

    .line 23
    .line 24
    iget-object p0, p0, La/b9y;->c:La/xgy;

    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    const/4 v3, 0x7

    .line 28
    invoke-static {p0, v2, v3}, La/x2x;->N(La/fhy;Ljava/util/List;I)La/v2;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-static {p0}, La/piy;->a(La/kiy;)Lkotlin/reflect/KTypeProjection;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-static {p0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    const/4 v1, 0x6

    .line 44
    invoke-static {v0, p0, v1}, La/x2x;->N(La/fhy;Ljava/util/List;I)La/v2;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
