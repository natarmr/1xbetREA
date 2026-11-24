.class public final La/pre0;
.super La/eys0;
.source "SourceFile"


# instance fields
.field public final synthetic a:La/siy;


# direct methods
.method public constructor <init>(La/siy;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/pre0;->a:La/siy;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final n(La/gys0;La/aty;)La/dcg0;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    sget-object p1, La/jtv;->u:La/jtv;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, La/jtv;->m0(La/aty;)La/dcg0;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, La/kiy;

    .line 14
    .line 15
    sget-object p2, La/siy;->c:La/siy;

    .line 16
    .line 17
    const/4 p2, 0x0

    .line 18
    iget-object p0, p0, La/pre0;->a:La/siy;

    .line 19
    .line 20
    invoke-virtual {p0, p1, p2}, La/siy;->c(La/kiy;Ljava/lang/String;)La/kiy;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    check-cast p0, La/v2;

    .line 25
    .line 26
    return-object p0
.end method
