.class public final La/hhk0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ze3;


# instance fields
.field public final a:La/mne;

.field public final b:La/azj0;

.field public final c:La/vby;


# direct methods
.method public constructor <init>(La/mne;La/azj0;La/vby;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/hhk0;->a:La/mne;

    .line 11
    .line 12
    iput-object p2, p0, La/hhk0;->b:La/azj0;

    .line 13
    .line 14
    iput-object p3, p0, La/hhk0;->c:La/vby;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final a()La/khf0;
    .locals 3

    .line 1
    iget-object v0, p0, La/hhk0;->b:La/azj0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, La/hhk0;->c:La/vby;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    new-instance v2, La/khf0;

    .line 12
    .line 13
    iget-object p0, p0, La/hhk0;->a:La/mne;

    .line 14
    .line 15
    invoke-direct {v2, p0, v0, v1}, La/khf0;-><init>(La/mne;La/azj0;La/vby;)V

    .line 16
    .line 17
    .line 18
    return-object v2
.end method
