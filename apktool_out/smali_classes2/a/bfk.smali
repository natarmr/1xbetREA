.class public final La/bfk;
.super La/g8x;
.source "SourceFile"


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/util/AbstractCollection;


# direct methods
.method public synthetic constructor <init>(Ljava/util/AbstractCollection;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/bfk;->a:B

    iput-object p1, p0, La/bfk;->b:Ljava/util/AbstractCollection;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final b0(La/mp9;La/mp9;)V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final t(La/mp9;)V
    .locals 2

    .line 1
    iget-byte v0, p0, La/bfk;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/bfk;->b:Ljava/util/AbstractCollection;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-static {p1, v1}, La/sf80;->r(La/mp9;Lkotlin/jvm/functions/Function1;)V

    .line 12
    .line 13
    .line 14
    check-cast p0, Ljava/util/LinkedHashSet;

    .line 15
    .line 16
    invoke-interface {p0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    const/4 p0, 0x3

    .line 21
    new-array p0, p0, [Ljava/lang/Object;

    .line 22
    .line 23
    const-string p1, "fakeOverride"

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    aput-object p1, p0, v0

    .line 27
    .line 28
    const-string p1, "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope$4"

    .line 29
    .line 30
    const/4 v0, 0x1

    .line 31
    aput-object p1, p0, v0

    .line 32
    .line 33
    const-string p1, "addFakeOverride"

    .line 34
    .line 35
    const/4 v0, 0x2

    .line 36
    aput-object p1, p0, v0

    .line 37
    .line 38
    const-string p1, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    .line 39
    .line 40
    invoke-static {p1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 45
    .line 46
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    invoke-static {p1, v1}, La/sf80;->r(La/mp9;Lkotlin/jvm/functions/Function1;)V

    .line 54
    .line 55
    .line 56
    check-cast p0, Ljava/util/ArrayList;

    .line 57
    .line 58
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final y(La/mp9;La/mp9;)V
    .locals 0

    .line 1
    iget-byte p0, p0, La/bfk;->a:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    instance-of p0, p2, La/oer;

    .line 8
    .line 9
    if-eqz p0, :cond_1

    .line 10
    .line 11
    check-cast p2, La/oer;

    .line 12
    .line 13
    iget-object p0, p2, La/oer;->Z:Ljava/util/Map;

    .line 14
    .line 15
    if-nez p0, :cond_0

    .line 16
    .line 17
    new-instance p0, Ljava/util/LinkedHashMap;

    .line 18
    .line 19
    invoke-direct {p0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p0, p2, La/oer;->Z:Ljava/util/Map;

    .line 23
    .line 24
    :cond_0
    sget-object p2, La/ifk;->a:La/ifk;

    .line 25
    .line 26
    invoke-interface {p0, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    :cond_1
    return-void

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
