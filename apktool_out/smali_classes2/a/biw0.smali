.class public final La/biw0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Z

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public f:La/owp0;

.field public final g:Ljava/lang/String;

.field public final h:J

.field public final i:J

.field public j:Z

.field public k:Lcom/google/firebase/auth/zzc;

.field public final l:Ljava/util/List;

.field public m:La/hhw0;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;La/owp0;Ljava/lang/String;JJLjava/util/ArrayList;La/ulw0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/biw0;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, La/biw0;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-boolean p3, p0, La/biw0;->c:Z

    .line 9
    .line 10
    iput-object p4, p0, La/biw0;->d:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p5, p0, La/biw0;->e:Ljava/lang/String;

    .line 13
    .line 14
    iget-object p1, p6, La/owp0;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p1, Ljava/util/List;

    .line 17
    .line 18
    new-instance p2, La/owp0;

    .line 19
    .line 20
    const/16 p3, 0x16

    .line 21
    .line 22
    invoke-direct {p2, p3}, La/owp0;-><init>(B)V

    .line 23
    .line 24
    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    iget-object p3, p2, La/owp0;->b:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p3, Ljava/util/List;

    .line 30
    .line 31
    invoke-interface {p3, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 32
    .line 33
    .line 34
    :cond_0
    iput-object p2, p0, La/biw0;->f:La/owp0;

    .line 35
    .line 36
    iput-object p7, p0, La/biw0;->g:Ljava/lang/String;

    .line 37
    .line 38
    iput-wide p8, p0, La/biw0;->h:J

    .line 39
    .line 40
    iput-wide p10, p0, La/biw0;->i:J

    .line 41
    .line 42
    const/4 p1, 0x0

    .line 43
    iput-boolean p1, p0, La/biw0;->j:Z

    .line 44
    .line 45
    const/4 p1, 0x0

    .line 46
    iput-object p1, p0, La/biw0;->k:Lcom/google/firebase/auth/zzc;

    .line 47
    .line 48
    iput-object p12, p0, La/biw0;->l:Ljava/util/List;

    .line 49
    .line 50
    iput-object p13, p0, La/biw0;->m:La/hhw0;

    .line 51
    .line 52
    return-void
.end method
