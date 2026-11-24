.class public final La/hn60;
.super La/zje;
.source "SourceFile"


# instance fields
.field public i:La/i1w0;

.field public j:J

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:La/nn60;

.field public m:I


# direct methods
.method public constructor <init>(La/nn60;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/hn60;->l:La/nn60;

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
    .locals 7

    .line 1
    iput-object p1, p0, La/hn60;->k:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/hn60;->m:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/hn60;->m:I

    .line 9
    .line 10
    const-wide/16 v3, 0x0

    .line 11
    .line 12
    const/4 v5, 0x0

    .line 13
    iget-object v0, p0, La/hn60;->l:La/nn60;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    const/4 v2, 0x0

    .line 17
    move-object v6, p0

    .line 18
    invoke-virtual/range {v0 .. v6}, La/nn60;->k(La/i1w0;La/a570;JLjava/lang/String;La/zje;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method
