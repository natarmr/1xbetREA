.class public final La/lxu;
.super La/zje;
.source "SourceFile"


# instance fields
.field public synthetic i:Ljava/lang/Object;

.field public final synthetic j:La/dgu;

.field public k:I


# direct methods
.method public constructor <init>(La/dgu;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/lxu;->j:La/dgu;

    .line 2
    .line 3
    invoke-direct {p0, p2}, La/zje;-><init>(La/yje;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iput-object p1, p0, La/lxu;->i:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/lxu;->k:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/lxu;->k:I

    .line 9
    .line 10
    const/4 v10, 0x0

    .line 11
    const/4 v6, 0x0

    .line 12
    iget-object v0, p0, La/lxu;->j:La/dgu;

    .line 13
    .line 14
    const-wide/16 v1, 0x0

    .line 15
    .line 16
    const-wide/16 v3, 0x0

    .line 17
    .line 18
    const/4 v5, 0x0

    .line 19
    const-wide/16 v7, 0x0

    .line 20
    .line 21
    move-object v9, p0

    .line 22
    invoke-virtual/range {v0 .. v10}, La/dgu;->k(DDIIJLa/zje;La/qvo0;)Ljava/io/Serializable;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method
