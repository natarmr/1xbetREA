.class public final La/ucf0;
.super La/f4x;
.source "SourceFile"


# instance fields
.field public final transient d:La/wcf0;

.field public final transient e:La/vcf0;


# direct methods
.method public constructor <init>(La/wcf0;La/vcf0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/ucf0;->d:La/wcf0;

    .line 5
    .line 6
    iput-object p2, p0, La/ucf0;->e:La/vcf0;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final b()La/b4x;
    .locals 0

    .line 1
    iget-object p0, p0, La/ucf0;->e:La/vcf0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    iget-object p0, p0, La/ucf0;->d:La/wcf0;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public final e(I[Ljava/lang/Object;)I
    .locals 0

    .line 1
    iget-object p0, p0, La/ucf0;->e:La/vcf0;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, La/b4x;->e(I[Ljava/lang/Object;)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final i()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final bridge synthetic iterator()Ljava/util/Iterator;
    .locals 0

    .line 1
    invoke-virtual {p0}, La/ucf0;->j()La/eet0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final j()La/eet0;
    .locals 1

    .line 1
    iget-object p0, p0, La/ucf0;->e:La/vcf0;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p0, v0}, La/b4x;->r(I)La/v3x;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    return-object p0
.end method

.method public final size()I
    .locals 0

    .line 1
    iget-object p0, p0, La/ucf0;->d:La/wcf0;

    .line 2
    .line 3
    iget p0, p0, La/wcf0;->f:I

    .line 4
    .line 5
    return p0
.end method
