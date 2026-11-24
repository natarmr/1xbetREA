.class public final La/k8r0;
.super La/zje;
.source "SourceFile"


# instance fields
.field public i:J

.field public j:La/y9s;

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:La/w5z;

.field public m:I


# direct methods
.method public constructor <init>(La/w5z;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/k8r0;->l:La/w5z;

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
    .locals 10

    .line 1
    iput-object p1, p0, La/k8r0;->k:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/k8r0;->m:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/k8r0;->m:I

    .line 9
    .line 10
    const/4 v6, 0x0

    .line 11
    const-wide/16 v7, 0x0

    .line 12
    .line 13
    iget-object v0, p0, La/k8r0;->l:La/w5z;

    .line 14
    .line 15
    const-wide/16 v1, 0x0

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    const/4 v4, 0x0

    .line 19
    const/4 v5, 0x0

    .line 20
    move-object v9, p0

    .line 21
    invoke-virtual/range {v0 .. v9}, La/w5z;->p(JIZLa/jvn;La/y9s;JLa/zje;)Ljava/io/Serializable;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method
