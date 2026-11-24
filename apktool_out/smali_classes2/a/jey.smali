.class public final La/jey;
.super La/ary;
.source "SourceFile"


# static fields
.field public static final synthetic h:[La/iiy;


# instance fields
.field public f:La/gey;

.field public final g:La/cu00;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/jey;

    .line 4
    .line 5
    const-string v2, "customizer"

    .line 6
    .line 7
    const-string v3, "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    new-array v1, v1, [La/iiy;

    .line 15
    .line 16
    aput-object v0, v1, v4

    .line 17
    .line 18
    sput-object v1, La/jey;->h:[La/iiy;

    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>(La/eu00;)V
    .locals 2

    .line 1
    sget-object v0, La/hey;->a:[La/hey;

    .line 2
    .line 3
    invoke-direct {p0, p1}, La/ary;-><init>(La/eu00;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, La/nsr;

    .line 7
    .line 8
    const/16 v1, 0x11

    .line 9
    .line 10
    invoke-direct {v0, p0, p1, v1}, La/nsr;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 11
    .line 12
    .line 13
    new-instance v1, La/cu00;

    .line 14
    .line 15
    invoke-direct {v1, p1, v0}, La/bu00;-><init>(La/eu00;Lkotlin/jvm/functions/Function0;)V

    .line 16
    .line 17
    .line 18
    iput-object v1, p0, La/jey;->g:La/cu00;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final L()La/mey;
    .locals 2

    .line 1
    sget-object v0, La/jey;->h:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object p0, p0, La/jey;->g:La/cu00;

    .line 7
    .line 8
    invoke-static {p0, v0}, La/yqm0;->s(La/r660;La/iiy;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, La/mey;

    .line 13
    .line 14
    return-object p0
.end method

.method public final d()La/fx;
    .locals 0

    .line 1
    invoke-virtual {p0}, La/jey;->L()La/mey;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final m()Ljava/lang/Iterable;
    .locals 3

    .line 1
    invoke-super {p0}, La/ary;->m()Ljava/lang/Iterable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, La/fey;

    .line 6
    .line 7
    invoke-virtual {p0}, La/ary;->l()La/zm40;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, La/ary;->d:La/eu00;

    .line 15
    .line 16
    invoke-direct {v1, p0, v2}, La/fey;-><init>(La/eu00;La/zm40;)V

    .line 17
    .line 18
    .line 19
    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->p0(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method

.method public final q()La/qv90;
    .locals 0

    .line 1
    invoke-virtual {p0}, La/jey;->L()La/mey;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method
