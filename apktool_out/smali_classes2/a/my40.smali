.class public final La/my40;
.super La/oo20;
.source "SourceFile"

# interfaces
.implements La/nhy;


# instance fields
.field public final d:La/vh90;

.field public e:La/wb00;

.field public final f:I


# direct methods
.method public constructor <init>(La/vh90;Ljava/lang/Object;La/wb00;)V
    .locals 2

    .line 1
    iget-object v0, p3, La/wb00;->a:Ljava/lang/Object;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {p0, p2, v0, v1}, La/oo20;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/my40;->d:La/vh90;

    .line 8
    .line 9
    iput-object p3, p0, La/my40;->e:La/wb00;

    .line 10
    .line 11
    iget-object p1, p1, La/vh90;->d:La/gh90;

    .line 12
    .line 13
    iget p1, p1, La/gh90;->f:I

    .line 14
    .line 15
    iput p1, p0, La/my40;->f:I

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final getValue()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, La/my40;->e:La/wb00;

    .line 2
    .line 3
    iget-object p0, p0, La/wb00;->a:Ljava/lang/Object;

    .line 4
    .line 5
    return-object p0
.end method

.method public final setValue(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, La/my40;->e:La/wb00;

    .line 2
    .line 3
    iget-object v1, v0, La/wb00;->a:Ljava/lang/Object;

    .line 4
    .line 5
    new-instance v2, La/wb00;

    .line 6
    .line 7
    iget-object v3, v0, La/wb00;->b:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v0, v0, La/wb00;->c:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-direct {v2, p1, v3, v0}, La/wb00;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iput-object v2, p0, La/my40;->e:La/wb00;

    .line 15
    .line 16
    iget-object v0, p0, La/my40;->d:La/vh90;

    .line 17
    .line 18
    iget-object v3, v0, La/vh90;->d:La/gh90;

    .line 19
    .line 20
    iget v4, v3, La/gh90;->f:I

    .line 21
    .line 22
    iget v5, p0, La/my40;->f:I

    .line 23
    .line 24
    iget-object p0, p0, La/oo20;->b:Ljava/lang/Object;

    .line 25
    .line 26
    if-ne v4, v5, :cond_0

    .line 27
    .line 28
    const/4 p1, 0x0

    .line 29
    iput-object p1, v0, La/vh90;->a:La/uh90;

    .line 30
    .line 31
    invoke-virtual {v3, p0, v2}, La/gh90;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    return-object v1

    .line 35
    :cond_0
    invoke-virtual {v3, p0}, La/gh90;->containsKey(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_1

    .line 40
    .line 41
    invoke-virtual {v0, p0, p1}, La/vh90;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    :cond_1
    return-object v1
.end method
