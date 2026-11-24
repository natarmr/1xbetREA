.class public final La/gek;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final b:La/iek;

.field public final c:La/ary;


# direct methods
.method public synthetic constructor <init>(La/iek;La/ary;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/gek;->a:B

    iput-object p1, p0, La/gek;->b:La/iek;

    iput-object p2, p0, La/gek;->c:La/ary;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/gek;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/gek;->c:La/ary;

    .line 4
    .line 5
    iget-object p0, p0, La/gek;->b:La/iek;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, La/iek;->a:La/lek;

    .line 11
    .line 12
    invoke-virtual {v0}, La/lek;->o()La/hoc;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-string v2, "Array"

    .line 17
    .line 18
    invoke-virtual {v1, v2}, La/ary;->k(Ljava/lang/String;)La/wm40;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v0, v1, p0}, La/hoc;->b(La/foc;La/iek;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-static {p0, v2}, Lkotlin/text/StringsKt;->r0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :pswitch_0
    iget-object v0, p0, La/iek;->a:La/lek;

    .line 32
    .line 33
    invoke-virtual {v0}, La/lek;->o()La/hoc;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    sget-object v2, La/i4m0;->C:La/swq;

    .line 41
    .line 42
    invoke-virtual {v1, v2}, La/ary;->j(La/swq;)La/wm40;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {v0, v1, p0}, La/hoc;->b(La/foc;La/iek;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    const-string v0, "Collection"

    .line 51
    .line 52
    invoke-static {p0, v0}, Lkotlin/text/StringsKt;->r0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
