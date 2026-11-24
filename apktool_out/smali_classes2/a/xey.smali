.class public final La/xey;
.super La/q0x;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    new-instance v0, La/wpv;

    .line 15
    .line 16
    const/4 v1, 0x4

    .line 17
    invoke-direct {v0, v1}, La/wpv;-><init>(B)V

    .line 18
    .line 19
    .line 20
    invoke-static {p1, v0}, La/tx3;->Y([Ljava/lang/Object;Ljava/util/Comparator;)Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iput-object p1, p0, La/xey;->a:Ljava/util/List;

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final H()Ljava/lang/String;
    .locals 6

    .line 1
    sget-object v4, La/j9x;->i:La/j9x;

    .line 2
    .line 3
    const/16 v5, 0x18

    .line 4
    .line 5
    iget-object v0, p0, La/xey;->a:Ljava/util/List;

    .line 6
    .line 7
    const-string v1, ""

    .line 8
    .line 9
    const-string v2, "<init>("

    .line 10
    .line 11
    const-string v3, ")V"

    .line 12
    .line 13
    invoke-static/range {v0 .. v5}, Lkotlin/collections/CollectionsKt;->b0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method
