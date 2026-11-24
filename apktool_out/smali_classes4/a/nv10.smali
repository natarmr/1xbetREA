.class public final La/nv10;
.super La/zx5;
.source "SourceFile"


# instance fields
.field public final synthetic o:La/qv10;


# direct methods
.method public constructor <init>(La/qv10;Landroidx/fragment/app/e;La/glz;La/c0o;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/nv10;->o:La/qv10;

    .line 11
    .line 12
    invoke-direct {p0, p2, p3, p4}, La/zx5;-><init>(Landroidx/fragment/app/e;La/glz;Ljava/util/List;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final B(I)Landroidx/fragment/app/Fragment;
    .locals 4

    .line 1
    sget-object v0, La/il5;->Q1:La/gl5;

    .line 2
    .line 3
    sget-object v1, La/l4b;->i:La/c0o;

    .line 4
    .line 5
    invoke-virtual {v1, p1}, La/c0o;->get(I)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, La/l4b;

    .line 10
    .line 11
    sget-object v1, La/qv10;->O1:La/htz;

    .line 12
    .line 13
    iget-object p0, p0, La/nv10;->o:La/qv10;

    .line 14
    .line 15
    iget-object v1, p0, La/qv10;->K1:La/cgx0;

    .line 16
    .line 17
    sget-object v2, La/qv10;->P1:[La/iiy;

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    aget-object v2, v2, v3

    .line 21
    .line 22
    invoke-virtual {v1, p0, v2}, La/cgx0;->r(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Boolean;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    new-instance v0, La/il5;

    .line 37
    .line 38
    invoke-direct {v0}, La/il5;-><init>()V

    .line 39
    .line 40
    .line 41
    sget-object v1, La/il5;->R1:[La/iiy;

    .line 42
    .line 43
    aget-object v2, v1, v3

    .line 44
    .line 45
    iget-object v3, v0, La/il5;->K1:La/yzn0;

    .line 46
    .line 47
    invoke-virtual {v3, v0, v2, p1}, La/yzn0;->u(Landroidx/fragment/app/Fragment;La/iiy;Ljava/io/Serializable;)V

    .line 48
    .line 49
    .line 50
    const/4 p1, 0x1

    .line 51
    aget-object p1, v1, p1

    .line 52
    .line 53
    iget-object v1, v0, La/il5;->L1:La/cgx0;

    .line 54
    .line 55
    invoke-virtual {v1, v0, p1, p0}, La/cgx0;->v(Landroidx/fragment/app/Fragment;La/iiy;Z)V

    .line 56
    .line 57
    .line 58
    return-object v0
.end method
