.class public final La/w8u;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/wdu;


# direct methods
.method public synthetic constructor <init>(La/wdu;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/w8u;->a:La/wdu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Z)La/gmq;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    sget-object p1, La/j8p;->b:La/j8p;

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    sget-object p1, La/j8p;->a:La/j8p;

    .line 7
    .line 8
    :goto_0
    iget-object p0, p0, La/w8u;->a:La/wdu;

    .line 9
    .line 10
    iget-object p0, p0, La/wdu;->j:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, La/f8p;

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-object p0, p0, La/f8p;->a:Ljava/util/LinkedHashMap;

    .line 18
    .line 19
    invoke-virtual {p0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    check-cast p0, La/ir30;

    .line 24
    .line 25
    if-eqz p0, :cond_1

    .line 26
    .line 27
    invoke-virtual {p0}, La/ir30;->c()La/p6d;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0

    .line 32
    :cond_1
    sget-object p0, La/dun;->a:La/dun;

    .line 33
    .line 34
    return-object p0
.end method
