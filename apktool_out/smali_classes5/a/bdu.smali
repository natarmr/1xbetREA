.class public final La/bdu;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/ntu;


# direct methods
.method public constructor <init>(La/ntu;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/bdu;->a:La/ntu;

    .line 5
    .line 6
    return-void
.end method

.method public constructor <init>(La/sqt;La/ntu;)V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput-object p2, p0, La/bdu;->a:La/ntu;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object p0, p0, La/bdu;->a:La/ntu;

    .line 2
    .line 3
    invoke-virtual {p0}, La/ntu;->a()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const-string v0, "/getZone/web_nz/index_android.html"

    .line 8
    .line 9
    invoke-static {p0, v0}, La/ohs0;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public b(I)Ljava/util/Map;
    .locals 1

    .line 1
    iget-object p0, p0, La/bdu;->a:La/ntu;

    .line 2
    .line 3
    invoke-virtual {p0}, La/ntu;->a()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    new-instance p1, Lkotlin/Pair;

    .line 15
    .line 16
    const-string v0, "HTTP_X_PROJECT_ID"

    .line 17
    .line 18
    invoke-direct {p1, v0, p0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    invoke-static {p1}, La/wp20;->b(Lkotlin/Pair;)Ljava/util/Map;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method
