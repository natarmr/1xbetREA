.class public final La/tfu0;
.super La/p4;
.source "SourceFile"


# instance fields
.field public final c:La/fq80;

.field public final d:La/fq80;

.field public e:I

.field public f:Z

.field public g:Z

.field public h:I


# direct methods
.method public constructor <init>(La/ncs0;)V
    .locals 1

    .line 1
    const/16 v0, 0xb

    .line 2
    .line 3
    invoke-direct {p0, p1, v0}, La/p4;-><init>(Ljava/lang/Object;B)V

    .line 4
    .line 5
    .line 6
    new-instance p1, La/fq80;

    .line 7
    .line 8
    sget-object v0, La/ntr;->j:[B

    .line 9
    .line 10
    invoke-direct {p1, v0}, La/fq80;-><init>([B)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, La/tfu0;->c:La/fq80;

    .line 14
    .line 15
    new-instance p1, La/fq80;

    .line 16
    .line 17
    const/4 v0, 0x4

    .line 18
    invoke-direct {p1, v0}, La/fq80;-><init>(I)V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, La/tfu0;->d:La/fq80;

    .line 22
    .line 23
    return-void
.end method
