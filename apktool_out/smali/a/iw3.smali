.class public final La/iw3;
.super La/zje;
.source "SourceFile"


# instance fields
.field public i:Ljava/util/Iterator;

.field public j:La/hf6;

.field public k:Ljava/lang/String;

.field public l:Ljava/lang/String;

.field public m:La/hsj;

.field public n:D

.field public o:I

.field public synthetic p:Ljava/lang/Object;

.field public final synthetic q:La/gr00;

.field public r:I


# direct methods
.method public constructor <init>(La/gr00;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/iw3;->q:La/gr00;

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
    .locals 1

    .line 1
    iput-object p1, p0, La/iw3;->p:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/iw3;->r:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/iw3;->r:I

    .line 9
    .line 10
    iget-object p1, p0, La/iw3;->q:La/gr00;

    .line 11
    .line 12
    invoke-virtual {p1, p0}, La/gr00;->z(La/zje;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method
