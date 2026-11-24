.class public final La/qe50;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:La/w950;


# instance fields
.field public final a:La/p7m0;

.field public final b:La/qoj0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/w950;

    .line 2
    .line 3
    new-instance v1, La/bb50;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v1, v2}, La/bb50;-><init>(Z)V

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1, v2, v2}, La/w950;-><init>(La/cb50;ZZ)V

    .line 10
    .line 11
    .line 12
    sput-object v0, La/qe50;->c:La/w950;

    .line 13
    .line 14
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, La/qe50;->c:La/w950;

    .line 5
    .line 6
    invoke-static {v0}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, La/qe50;->a:La/p7m0;

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    sget-object v1, La/i99;->b:La/i99;

    .line 14
    .line 15
    invoke-static {v0, v0, v1}, La/roj0;->a(IILa/i99;)La/qoj0;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, La/qe50;->b:La/qoj0;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final a(La/cb50;Z)V
    .locals 3

    .line 1
    new-instance v0, La/w950;

    .line 2
    .line 3
    iget-object p0, p0, La/qe50;->a:La/p7m0;

    .line 4
    .line 5
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, La/w950;

    .line 10
    .line 11
    iget-object v1, v1, La/w950;->a:La/cb50;

    .line 12
    .line 13
    iget-object v1, v1, La/cb50;->a:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v2, p1, La/cb50;->a:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    invoke-direct {v0, p1, p2, v1}, La/w950;-><init>(La/cb50;ZZ)V

    .line 22
    .line 23
    .line 24
    const/4 p1, 0x0

    .line 25
    invoke-virtual {p0, p1, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    return-void
.end method
