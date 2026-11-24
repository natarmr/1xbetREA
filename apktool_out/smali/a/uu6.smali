.class public final La/uu6;
.super La/zje;
.source "SourceFile"


# instance fields
.field public synthetic i:Ljava/lang/Object;

.field public final synthetic j:La/chf0;

.field public k:I


# direct methods
.method public constructor <init>(La/chf0;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/uu6;->j:La/chf0;

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
    iput-object p1, p0, La/uu6;->i:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/uu6;->k:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/uu6;->k:I

    .line 9
    .line 10
    const-wide/16 v6, 0x0

    .line 11
    .line 12
    const-wide/16 v8, 0x0

    .line 13
    .line 14
    iget-object v0, p0, La/uu6;->j:La/chf0;

    .line 15
    .line 16
    const-wide/16 v1, 0x0

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    const-wide/16 v4, 0x0

    .line 20
    .line 21
    move-object v10, p0

    .line 22
    invoke-virtual/range {v0 .. v10}, La/chf0;->r(JIDJJLa/zje;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method
