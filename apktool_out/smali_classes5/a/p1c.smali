.class public final La/p1c;
.super La/zje;
.source "SourceFile"


# instance fields
.field public i:Lorg/xplatform/security/api/presentation/models/SendEmailIntention$RestorePassword;

.field public j:La/owf0;

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:La/s1c;

.field public m:I


# direct methods
.method public constructor <init>(La/s1c;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/p1c;->l:La/s1c;

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
    iput-object p1, p0, La/p1c;->k:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/p1c;->m:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/p1c;->m:I

    .line 9
    .line 10
    iget-object p1, p0, La/p1c;->l:La/s1c;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p1, v0, v0, p0}, La/s1c;->D(Ljava/lang/String;Lorg/xplatform/security/api/presentation/models/SendEmailIntention$RestorePassword;La/zje;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method
