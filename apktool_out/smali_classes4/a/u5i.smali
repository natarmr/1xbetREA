.class public final La/u5i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/j0h0;


# instance fields
.field public final synthetic a:La/t5i;


# direct methods
.method public constructor <init>(La/t5i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/u5i;->a:La/t5i;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;La/i1w0;)La/diu0;
    .locals 9

    .line 1
    new-instance v0, La/uf;

    .line 2
    .line 3
    iget-object p0, p0, La/u5i;->a:La/t5i;

    .line 4
    .line 5
    iget-object p0, p0, La/t5i;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/gr00;

    .line 8
    .line 9
    new-instance v1, La/hsj;

    .line 10
    .line 11
    new-instance v2, La/cmt;

    .line 12
    .line 13
    new-instance v3, La/ehf0;

    .line 14
    .line 15
    iget-object v4, p0, La/gr00;->a:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v4, La/btt0;

    .line 18
    .line 19
    new-instance v5, La/fvt0;

    .line 20
    .line 21
    iget-object v6, p0, La/gr00;->b:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v6, La/gii0;

    .line 24
    .line 25
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    const-class v7, La/ze;

    .line 29
    .line 30
    sget-object v8, La/sre0;->a:La/tre0;

    .line 31
    .line 32
    invoke-virtual {v8, v7}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 33
    .line 34
    .line 35
    move-result-object v7

    .line 36
    invoke-virtual {v6, v7}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v6

    .line 40
    check-cast v6, La/ze;

    .line 41
    .line 42
    invoke-direct {v5, v6}, La/fvt0;-><init>(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    invoke-direct {v3, v4, v5}, La/ehf0;-><init>(La/btt0;La/fvt0;)V

    .line 46
    .line 47
    .line 48
    const/4 v4, 0x0

    .line 49
    invoke-direct {v2, v3, v4}, La/cmt;-><init>(Ljava/lang/Object;B)V

    .line 50
    .line 51
    .line 52
    iget-object v3, p0, La/gr00;->c:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v3, La/gst;

    .line 55
    .line 56
    invoke-direct {v1, v2, v3}, La/hsj;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    iget-object p0, p0, La/gr00;->d:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast p0, La/sa10;

    .line 62
    .line 63
    invoke-direct {v0, p1, p2, v1, p0}, La/uf;-><init>(La/vzg0;La/i1w0;La/hsj;La/sa10;)V

    .line 64
    .line 65
    .line 66
    return-object v0
.end method
